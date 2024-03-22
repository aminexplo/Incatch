open Consistency
one sig PersonPhone extends Artifact {}

one sig R2 extends Rule {}
one sig R3 extends Rule {}
one sig R1 extends Rule {}

one sig three_rules_hard_no_inc extends Scenario {
} {
	artifacts = PersonPhone
	rules = R2 + R3 + R1
	givenRM = (R2 -> R1) + (R2 -> R3) + (R3 -> R2) + (R3 -> R1) + (R1 -> R2) + (R1 -> R3) 
	givenTranslation = (R2 -> R2) + (R3 -> R3) + (R1 -> R1)
	givenRE = (R2 -> R1) + (R2 -> R3) + (R3 -> R2) + (R3 -> R1) + (R1 -> R2) + (R1 -> R3) 
	givenE =  (PersonPhone -> R3) + (PersonPhone -> R2) + (PersonPhone -> R1)
}

assert three_rules_hard_no_inc_Assertion____R2____R1 {
	Consistency_r[three_rules_hard_no_inc, PersonPhone, PersonPhone, R2, R1]
}
check three_rules_hard_no_inc_Assertion____R2____R1 for 1

assert three_rules_hard_no_inc_Assertion____R2____R3 {
	Consistency_r[three_rules_hard_no_inc, PersonPhone, PersonPhone, R2, R3]
}
check three_rules_hard_no_inc_Assertion____R2____R3 for 1

assert three_rules_hard_no_inc_Assertion____R3____R1 {
	Consistency_r[three_rules_hard_no_inc, PersonPhone, PersonPhone, R3, R1]
}
check three_rules_hard_no_inc_Assertion____R3____R1 for 1


