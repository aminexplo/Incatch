sig Artifact {}
sig Rule {}

sig Scenario {
	artifacts : set Artifact,
	rules: set Rule,
	// These we assume given. In the future, they may be dynamically computed
	givenRM  : rules -> rules,
	givenRE : rules -> rules,
	givenTranslation : rules -> rules,
	givenE : artifacts -> rules
}

fun RT[s: one Scenario, r: one Rule]: one Rule {
	r.(s.givenTranslation)
}

pred RM[s: one Scenario, r1: one Rule, r2: one Rule] {
	r1 -> r2 in s.givenRM
}

pred RE[s: one Scenario, r1: one Rule, r2: one Rule] {
	RT[s, r1] -> RT[s, r2] in s.givenRE
}

pred RR[s: one Scenario, r1: one Rule, r2: one Rule] {
	RM[s, r1, r2] and RE[s, RT[s, r1], RT[s, r2]]
}

pred E[s: one Scenario, a: one Artifact, r: one Rule] {
	a -> r in s.givenE
}

pred Consistency_r [s: one Scenario, a: one Artifact, b: one Artifact, r1: one Rule, r2: one Rule] {
	RR[s, r1, r2] implies (E[s, a, r1] iff E[s, b, r2])
}
