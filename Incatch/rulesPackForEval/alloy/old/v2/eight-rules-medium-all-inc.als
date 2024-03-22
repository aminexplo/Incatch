open Consistency
one sig PersonPhone extends Artifact {}

one sig R1 extends Rule {}
one sig R2 extends Rule {}
one sig R3 extends Rule {}
one sig R4 extends Rule {}
one sig R5 extends Rule {}
one sig R6 extends Rule {}
one sig R7 extends Rule {}
one sig R8 extends Rule {}

one sig eight_rules_medium_all_inc extends Scenario {
} {
	artifacts = PersonPhone
	rules = R2 + R3 + R4 + R5 + R6 + R7 + R8 + R1
	givenRM = (R1 -> R5) + (R2 -> R6) + (R2 -> R7) + (R3 -> R7) + (R3 -> R8) + (R4 -> R6) + (R4 -> R8) + (R5 -> R1) + (R6 -> R2) + (R6 -> R4) + (R7 -> R3) + (R7 -> R2) + (R8 -> R3) + (R8 -> R4) 
	givenTranslation = (R5 -> R5) + (R4 -> R4) + (R6 -> R6) + (R8 -> R8) + (R2 -> R2) + (R7 -> R7) + (R3 -> R3) + (R1 -> R1)
	givenRE = (R1 -> R5) + (R2 -> R6) + (R2 -> R7) + (R3 -> R7) + (R3 -> R8) + (R4 -> R6) + (R4 -> R8) + (R5 -> R1) + (R6 -> R2) + (R6 -> R4) + (R7 -> R3) + (R7 -> R2) + (R8 -> R3) + (R8 -> R4) 
	givenE =  (PersonPhone -> R4) + (PersonPhone -> R3) + (PersonPhone -> R2) + (PersonPhone -> R1)
}

assert eight_rules_medium_all_inc_Assertion____R1____R5 {
	Consistency_r[eight_rules_medium_all_inc, PersonPhone, PersonPhone, R1, R5]
}
check eight_rules_medium_all_inc_Assertion____R1____R5 for 1

assert eight_rules_medium_all_inc_Assertion____R2____R6 {
	Consistency_r[eight_rules_medium_all_inc, PersonPhone, PersonPhone, R2, R6]
}
check eight_rules_medium_all_inc_Assertion____R2____R6 for 1

assert eight_rules_medium_all_inc_Assertion____R2____R7 {
	Consistency_r[eight_rules_medium_all_inc, PersonPhone, PersonPhone, R2, R7]
}
check eight_rules_medium_all_inc_Assertion____R2____R7 for 1

assert eight_rules_medium_all_inc_Assertion____R3____R7 {
	Consistency_r[eight_rules_medium_all_inc, PersonPhone, PersonPhone, R3, R7]
}
check eight_rules_medium_all_inc_Assertion____R3____R7 for 1

assert eight_rules_medium_all_inc_Assertion____R3____R8 {
	Consistency_r[eight_rules_medium_all_inc, PersonPhone, PersonPhone, R3, R8]
}
check eight_rules_medium_all_inc_Assertion____R3____R8 for 1

assert eight_rules_medium_all_inc_Assertion____R4____R8 {
	Consistency_r[eight_rules_medium_all_inc, PersonPhone, PersonPhone, R4, R8]
}
check eight_rules_medium_all_inc_Assertion____R4____R8 for 1

assert eight_rules_medium_all_inc_Assertion____R4____R6 {
	Consistency_r[eight_rules_medium_all_inc, PersonPhone, PersonPhone, R4, R6]
}
check eight_rules_medium_all_inc_Assertion____R4____R6 for 1


