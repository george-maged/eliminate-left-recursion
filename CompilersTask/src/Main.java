import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
//		//Lec3
//		ArrayList<ArrayList<String>> rhs1 = new ArrayList<>();
//		ArrayList<String> rhs11 = new ArrayList<>();
//		rhs11.add("A");rhs11.add("a"); 
//		ArrayList<String> rhs12 = new ArrayList<>();
//		rhs12.add("b");
//		//Aa | b
//		
//		rhs1.add(rhs11);
//		rhs1.add(rhs12);
//		Rule r1 = new Rule("S",  rhs1); // S -> Aa | b
//		
//		ArrayList<ArrayList<String>> rhs2 = new ArrayList<>();
//		ArrayList<String> rhs21 = new ArrayList<>();
//		rhs21.add("A");rhs21.add("c"); 
//		ArrayList<String> rhs22 = new ArrayList<>();
//		rhs22.add("S");rhs22.add("d");
//		ArrayList<String> rhs23 = new ArrayList<>();
//		rhs23.add("e");
//		
//		rhs2.add(rhs21);
//		rhs2.add(rhs22);
//		rhs2.add(rhs23);
//		Rule r2 = new Rule("A",  rhs2); // A -> Ac | Sd | e
//		ArrayList<Rule> rules = new ArrayList<>();
//		rules.add(r1);
//		rules.add(r2);
//		Grammar g = new Grammar(rules);
//		g.eliminateEpsilonRule();
//		System.out.println(g);
//		g.eliminateLR();
//		System.out.println(g);
//		System.out.println("----------------------");
		
//		//PA4 a
//		ArrayList<ArrayList<String>> rhs1 = new ArrayList<>();
//		ArrayList<String> rhs11 = new ArrayList<>();
//		rhs11.add("S");rhs11.add("a");
//		ArrayList<String> rhs12 = new ArrayList<>();
//		rhs12.add("b");		
//		rhs1.add(rhs11);
//		rhs1.add(rhs12);
//
//		Rule r1 = new Rule("S",  rhs1); // S -> Aa | b
//		ArrayList<Rule> rules = new ArrayList<>();
//		rules.add(r1);
//		Grammar g = new Grammar(rules);
//		g.eliminateEpsilonRule();
//		g.eliminateLR();
//		System.out.println(g);
//		System.out.println("----------------------");
		
//		//PA4 b
//		ArrayList<ArrayList<String>> rhs1 = new ArrayList<>();
//		ArrayList<String> rhs11 = new ArrayList<>();
//		rhs11.add("S");rhs11.add("a");rhs11.add("b");
//		ArrayList<String> rhs12 = new ArrayList<>();
//		rhs12.add("c");rhs12.add("d");		
//		rhs1.add(rhs11);
//		rhs1.add(rhs12);
//
//		Rule r1 = new Rule("S",  rhs1); // S -> Aa | b
//		ArrayList<Rule> rules = new ArrayList<>();
//		rules.add(r1);
//		Grammar g = new Grammar(rules);
//		g.eliminateEpsilonRule();
//		g.eliminateLR();
//		System.out.println(g);
//		System.out.println("----------------------");
		
//		//PA4 c
//		ArrayList<ArrayList<String>> rhs1 = new ArrayList<>();
//		ArrayList<String> rhs11 = new ArrayList<>();
//		rhs11.add("S");rhs11.add("U");rhs11.add("S");
//		ArrayList<String> rhs12 = new ArrayList<>();
//		rhs12.add("S");rhs12.add("S");		
//		ArrayList<String> rhs13 = new ArrayList<>();
//		rhs13.add("S");rhs13.add("*");
//		ArrayList<String> rhs14 = new ArrayList<>();
//		rhs14.add("(");rhs14.add("S");rhs14.add(")");
//		ArrayList<String> rhs15 = new ArrayList<>();
//		rhs15.add("a");
//		rhs1.add(rhs11);
//		rhs1.add(rhs12);
//		rhs1.add(rhs13);
//		rhs1.add(rhs14);
//		rhs1.add(rhs15);
//
//
//		Rule r1 = new Rule("S",  rhs1); // S -> Aa | b
//		ArrayList<Rule> rules = new ArrayList<>();
//		rules.add(r1);
//		Grammar g = new Grammar(rules);
//		g.eliminateEpsilonRule();
//		g.eliminateLR();
//		System.out.println(g);
//		System.out.println("----------------------");
		
		
//		//PA-3 d
//		
//		ArrayList<ArrayList<String>> rhs1 = new ArrayList<>();
//		ArrayList<String> rhs11 = new ArrayList<>();
//		rhs11.add("rexpr");rhs11.add("U");rhs11.add("rterm");	
//		ArrayList<String> rhs12 = new ArrayList<>();
//		rhs12.add("rterm");
//		rhs1.add(rhs11);
//		rhs1.add(rhs12);
//		Rule r1 = new Rule("rexpr",  rhs1);
//
//		ArrayList<ArrayList<String>> rhs2 = new ArrayList<>();
//		ArrayList<String> rhs21 = new ArrayList<>();
//		rhs21.add("rterm");rhs21.add("r factor");
//		ArrayList<String> rhs22 = new ArrayList<>();
//		rhs22.add("r factor");
//		rhs2.add(rhs21);
//		rhs2.add(rhs22);
//		Rule r2 = new Rule("rterm",  rhs2);
//
//		ArrayList<ArrayList<String>> rhs3 = new ArrayList<>();
//		ArrayList<String> rhs31 = new ArrayList<>();
//		rhs31.add("r factor");rhs31.add("*");
//		ArrayList<String> rhs32 = new ArrayList<>();
//		rhs32.add("rprimary");
//		rhs3.add(rhs31);
//		rhs3.add(rhs32);
//		Rule r3 = new Rule("r factor",  rhs3);
//		
//		ArrayList<ArrayList<String>> rhs4 = new ArrayList<>();
//		ArrayList<String> rhs41 = new ArrayList<>();
//		rhs41.add("a");
//		ArrayList<String> rhs42 = new ArrayList<>();
//		rhs42.add("b");
//		rhs4.add(rhs41);
//		rhs4.add(rhs42);
//		Rule r4 = new Rule("rprimary",  rhs4);
//
//		ArrayList<Rule> rules = new ArrayList<>();
//		rules.add(r1);
//		rules.add(r2);
//		rules.add(r3);
//		rules.add(r4);
//		Grammar g = new Grammar(rules);
//		g.eliminateEpsilonRule();
//		g.eliminateLR();
//
//		System.out.println(g);
//		System.out.println("----------------------");	
			
//		//PA-3 e	
//		
//		ArrayList<ArrayList<String>> rhs1 = new ArrayList<>();
//		ArrayList<String> rhs11 = new ArrayList<>();
//		rhs11.add("0");
//		ArrayList<String> rhs12 = new ArrayList<>();
//		rhs12.add("T");rhs12.add("1");		
//		rhs1.add(rhs11);
//		rhs1.add(rhs12);
//		
//		ArrayList<ArrayList<String>> rhs2 = new ArrayList<>();
//		ArrayList<String> rhs21 = new ArrayList<>();
//		rhs21.add("1");
//		ArrayList<String> rhs22 = new ArrayList<>();
//		rhs22.add("A");rhs22.add("0");		
//		rhs2.add(rhs21);
//		rhs2.add(rhs22);
//
//		Rule r1 = new Rule("A",  rhs1);
//		Rule r2 = new Rule("T",  rhs2);
//
//		ArrayList<Rule> rules = new ArrayList<>();
//		rules.add(r1);
//		rules.add(r2);
//		Grammar g = new Grammar(rules);
//		g.eliminateEpsilonRule();
//		g.eliminateLR();
//		System.out.println(g);
//		System.out.println("----------------------");


		
//		//PA-3 f
//		
//		ArrayList<ArrayList<String>> rhs1 = new ArrayList<>();
//		ArrayList<String> rhs11 = new ArrayList<>();
//		rhs11.add("B");rhs11.add("C");	
//		rhs1.add(rhs11);
//		Rule r1 = new Rule("A",  rhs1);
//
//		ArrayList<ArrayList<String>> rhs2 = new ArrayList<>();
//		ArrayList<String> rhs21 = new ArrayList<>();
//		rhs21.add("B");rhs21.add("b");
//		ArrayList<String> rhs22 = new ArrayList<>();
//		rhs22.add("e");
//		rhs2.add(rhs21);
//		rhs2.add(rhs22);
//		Rule r2 = new Rule("B",  rhs2);
//
//		ArrayList<ArrayList<String>> rhs3 = new ArrayList<>();
//		ArrayList<String> rhs31 = new ArrayList<>();
//		rhs31.add("A");rhs31.add("C");
//		ArrayList<String> rhs32 = new ArrayList<>();
//		rhs32.add("a");
//		rhs3.add(rhs31);
//		rhs3.add(rhs32);
//		Rule r3 = new Rule("C",  rhs3);
//
//		ArrayList<Rule> rules = new ArrayList<>();
//		rules.add(r1);
//		rules.add(r2);
//		rules.add(r3);
//		Grammar g = new Grammar(rules);
//		System.out.println(g);
//		g.eliminateEpsilonRule();
//		System.out.println(g);
//
//		g.eliminateLR();
//
//		System.out.println(g);
//		System.out.println("----------------------");

	}
}
