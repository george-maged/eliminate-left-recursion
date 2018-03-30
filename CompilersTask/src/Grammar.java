import java.util.ArrayList;
import java.util.List;

public class Grammar {
	ArrayList<Rule> rules;
	public Grammar(ArrayList<Rule> rules) {
		this.rules = rules;
	}
	public void eliminateEpsilonRule() {
		for(Rule rule : rules) {
			if(rule.hasEpsilon()) {
				substitueWithEpsilon(rule.LHS);
			}			
		}
	}
	private void substitueWithEpsilon(String LHS) {
		for (int i = 0 ; i < rules.size();i++) {
			Rule rule = rules.get(i);
			for (int j = 0;j< rule.RHS.size();j++) {
				ArrayList<String> term = rule.RHS.get(j);
				for (String singular : term) {
					if(singular.equals(LHS)) {
						ArrayList<String> termWithoutSingular = (ArrayList<String>) term.clone();
						termWithoutSingular.remove(singular);
						rule.RHS.add(termWithoutSingular);
					}
				}
			}
		}
	}
	@Override
	public String toString() {
		String out = "";
		for (Rule rule : rules) {
			out+= rule.LHS+" -> "+rule.RHS+"\n";
		}
		return out;
	}

	private void replaceBelow(Rule r, List<Rule> otherRules) {
		for(int i = 0 ; i < otherRules.size();i++) {		
			replaceInRule(r.LHS,r.RHS,otherRules.get(i));
		}
	}
	private void replaceInRule(String LHS, ArrayList<ArrayList<String>> RHS, Rule rule) {
		for(int i = 0 ; i < rule.RHS.size();i++) {
			ArrayList<String> term = rule.RHS.get(i);
			if(term.contains(LHS)) {
				int index = term.indexOf(LHS);
				List<String> before = term.subList(0, index);
				List<String> after = term.subList(index+1, term.size());
				for (ArrayList<String> rhsTerm : RHS) {
					ArrayList<String> tempTerm = new ArrayList<>();
					tempTerm.addAll(before);
					tempTerm.addAll(rhsTerm);
					tempTerm.addAll(after);
					rule.RHS.add(tempTerm);
				}
				rule.RHS.remove(term);
				break;
			}
		}
	}
	public void eliminateLR() {
		for (int i = 0 ; i < rules.size() ;i++) {
			if(rules.get(i).hasLR()) {
				rules.get(i).removeLR(this);
				if(i+2 <= rules.size()-1) {
					replaceBelow(rules.get(i), rules.subList(i+2, rules.size()));
				}
				i++;
			} else {
				replaceBelow(rules.get(i), rules.subList(i+1, rules.size()));
			}
		}
	}
}
