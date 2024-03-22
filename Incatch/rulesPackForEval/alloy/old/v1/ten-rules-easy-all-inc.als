open Consistency
one sig PersonPhone extends Artifact {}

one sig R2 extends Rule {}
one sig R3 extends Rule {}
one sig R1 extends Rule {}
one sig R4 extends Rule {}
one sig R5 extends Rule {}
one sig R6 extends Rule {}
one sig R7 extends Rule {}
one sig R8 extends Rule {}
one sig R9 extends Rule {}
one sig R10 extends Rule {}

one sig ten_rules_easy_all_inc extends Scenario {
} {
	artifacts = PersonPhone
	rules = R2 + R10 + R3 + R4 + R5 + R6 + R7 + R8 + R9 + R1
	givenRM = (R2 -> R7) + (R3 -> R8) + (R1 -> R6) + (R4 -> R9) + (R5 -> R10) + (R6 -> R1) + (R7 -> R2) + (R8 -> R3) + (R9 -> R4) + (R10 -> R5) 
	givenTranslation = (R5 -> R5) + (R4 -> R4) + (R6 -> R6) + (R8 -> R8) + (R9 -> R9) + (R2 -> R2) + (R7 -> R7) + (R10 -> R10) + (R3 -> R3) + (R1 -> R1)
	givenRE = (R2 -> R7) + (R3 -> R8) + (R1 -> R6) + (R4 -> R9) + (R5 -> R10) + (R6 -> R1) + (R7 -> R2) + (R8 -> R3) + (R9 -> R4) + (R10 -> R5) 
	givenE =  none -> none
}

assert ten_rules_easy_all_inc_Assertion____R2____R7 {
	Consistency_r[ten_rules_easy_all_inc, PersonPhone, PersonPhone, R2, R7]
}
check ten_rules_easy_all_inc_Assertion____R2____R7 for 1

assert ten_rules_easy_all_inc_Assertion____R3____R8 {
	Consistency_r[ten_rules_easy_all_inc, PersonPhone, PersonPhone, R3, R8]
}
check ten_rules_easy_all_inc_Assertion____R3____R8 for 1

assert ten_rules_easy_all_inc_Assertion____R1____R6 {
	Consistency_r[ten_rules_easy_all_inc, PersonPhone, PersonPhone, R1, R6]
}
check ten_rules_easy_all_inc_Assertion____R1____R6 for 1

assert ten_rules_easy_all_inc_Assertion____R4____R9 {
	Consistency_r[ten_rules_easy_all_inc, PersonPhone, PersonPhone, R4, R9]
}
check ten_rules_easy_all_inc_Assertion____R4____R9 for 1

assert ten_rules_easy_all_inc_Assertion____R5____R10 {
	Consistency_r[ten_rules_easy_all_inc, PersonPhone, PersonPhone, R5, R10]
}
check ten_rules_easy_all_inc_Assertion____R5____R10 for 1


