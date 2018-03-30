import java.util.ArrayList;

public class Rule {
	public String LHS;
	public ArrayList<ArrayList<String>> RHS;
	public Rule(String LHS, ArrayList<ArrayList<String>> RHS) {
		this.LHS = LHS;
		this.RHS = RHS;
	}
	public boolean hasEpsilon() {
		for (int i = 0; i < RHS.size(); i++) {
			if(RHS.get(i).size() == 1 && RHS.get(i).get(0).equals("e")) {
				RHS.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean hasLR() {
		for (int i = 0; i < RHS.size(); i++) {
			if(RHS.get(i).get(0).equals(LHS)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return LHS+" -> "+RHS+"\n";
	}
	public void removeLR(Grammar grammar) {
		int indexOfThisRule = grammar.rules.indexOf(this);
		grammar.rules.remove(this);
		ArrayList<ArrayList<String>> newRule1RHS = new ArrayList<>();
		ArrayList<ArrayList<String>> newRule2RHS = new ArrayList<>();

		for (int i = 0; i < this.RHS.size(); i++) {
			ArrayList<String> cloneTerm = (ArrayList<String>) RHS.get(i).clone();
			if(RHS.get(i).get(0).equals(this.LHS)) {
				//ALPHA
				cloneTerm.remove(0);
				cloneTerm.add(this.LHS+"'");
				newRule2RHS.add(cloneTerm);
				ArrayList<String> epsilon = new ArrayList<>();
				epsilon.add("e");
				if(!newRule2RHS.contains(epsilon)) {
					newRule2RHS.add(epsilon);
				}
			} else {
				//BETA
				cloneTerm.add(this.LHS+"'");
				newRule1RHS.add(cloneTerm);
			}
		}
		Rule newRule1 = new Rule(this.LHS, newRule1RHS);
		Rule newRule2 = new Rule(this.LHS+"'", newRule2RHS);
		
		grammar.rules.add(indexOfThisRule,newRule1);
		grammar.rules.add(indexOfThisRule+1,newRule2);
	}

}
