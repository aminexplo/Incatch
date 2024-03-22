open Consistency
one sig PersonPhone extends Artifact {}

one sig R2 extends Rule {}
one sig R3 extends Rule {}
one sig R1 extends Rule {}
one sig R4 extends Rule {}
one sig R5 extends Rule {}

one sig five_rules_hard_no_inc extends Scenario {
} {
	artifacts = PersonPhone
	rules = R2 + R3 + R4 + R5 + R1
	givenRM = (R2 -> R5) + (R2 -> R1) + (R2 -> R4) + (R2 -> R3) + (R3 -> R5) + (R3 -> R4) + (R3 -> R2) + (R3 -> R1) + (R1 -> R4) + (R1 -> R5) + (R1 -> R2) + (R1 -> R3) + (R4 -> R5) + (R4 -> R3) + (R4 -> R1) + (R4 -> R2) + (R5 -> R3) + (R5 -> R2) + (R5 -> R4) + (R5 -> R1) 
	givenTranslation = (R5 -> R5) + (R4 -> R4) + (R2 -> R2) + (R3 -> R3) + (R1 -> R1)
	givenRE = (R2 -> R5) + (R2 -> R1) + (R2 -> R4) + (R2 -> R3) + (R3 -> R5) + (R3 -> R4) + (R3 -> R2) + (R3 -> R1) + (R1 -> R4) + (R1 -> R5) + (R1 -> R2) + (R1 -> R3) + (R4 -> R5) + (R4 -> R3) + (R4 -> R1) + (R4 -> R2) + (R5 -> R3) + (R5 -> R2) + (R5 -> R4) + (R5 -> R1) 
	givenE =  (PersonPhone -> R5) + (PersonPhone -> R4) + (PersonPhone -> R3) + (PersonPhone -> R2) + (PersonPhone -> R1)
}

assert five_rules_hard_no_inc_Assertion____R2____R3 {
	Consistency_r[five_rules_hard_no_inc, PersonPhone, PersonPhone, R2, R3]
}
check five_rules_hard_no_inc_Assertion____R2____R3 for 1

assert five_rules_hard_no_inc_Assertion____R2____R1 {
	Consistency_r[five_rules_hard_no_inc, PersonPhone, PersonPhone, R2, R1]
}
check five_rules_hard_no_inc_Assertion____R2____R1 for 1

assert five_rules_hard_no_inc_Assertion____R2____R4 {
	Consistency_r[five_rules_hard_no_inc, PersonPhone, PersonPhone, R2, R4]
}
check five_rules_hard_no_inc_Assertion____R2____R4 for 1

assert five_rules_hard_no_inc_Assertion____R2____R5 {
	Consistency_r[five_rules_hard_no_inc, PersonPhone, PersonPhone, R2, R5]
}
check five_rules_hard_no_inc_Assertion____R2____R5 for 1

assert five_rules_hard_no_inc_Assertion____R3____R1 {
	Consistency_r[five_rules_hard_no_inc, PersonPhone, PersonPhone, R3, R1]
}
check five_rules_hard_no_inc_Assertion____R3____R1 for 1

assert five_rules_hard_no_inc_Assertion____R3____R4 {
	Consistency_r[five_rules_hard_no_inc, PersonPhone, PersonPhone, R3, R4]
}
check five_rules_hard_no_inc_Assertion____R3____R4 for 1

assert five_rules_hard_no_inc_Assertion____R3____R5 {
	Consistency_r[five_rules_hard_no_inc, PersonPhone, PersonPhone, R3, R5]
}
check five_rules_hard_no_inc_Assertion____R3____R5 for 1

assert five_rules_hard_no_inc_Assertion____R1____R4 {
	Consistency_r[five_rules_hard_no_inc, PersonPhone, PersonPhone, R1, R4]
}
check five_rules_hard_no_inc_Assertion____R1____R4 for 1

assert five_rules_hard_no_inc_Assertion____R1____R5 {
	Consistency_r[five_rules_hard_no_inc, PersonPhone, PersonPhone, R1, R5]
}
check five_rules_hard_no_inc_Assertion____R1____R5 for 1

assert five_rules_hard_no_inc_Assertion____R4____R5 {
	Consistency_r[five_rules_hard_no_inc, PersonPhone, PersonPhone, R4, R5]
}
check five_rules_hard_no_inc_Assertion____R4____R5 for 1


