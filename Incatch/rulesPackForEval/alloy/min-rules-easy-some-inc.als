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
one sig R9 extends Rule {}
one sig R10 extends Rule {}

one sig min_rules_easy_some_inc extends Scenario {
} {
	artifacts = PersonPhone
	rules = R2 + R10 + R3 + R4 + R5 + R6 + R7 + R8 + R9 + R1
	givenRM = (R1 -> R2) + (R2 -> R1) + (R3 -> R4) + (R4 -> R3) + (R5 -> R6) + (R6 -> R5) + (R7 -> R8) + (R8 -> R7) + (R9 -> R10) + (R10 -> R9) 
	givenTranslation = (R5 -> R5) + (R4 -> R4) + (R6 -> R6) + (R8 -> R8) + (R9 -> R9) + (R2 -> R2) + (R7 -> R7) + (R10 -> R10) + (R3 -> R3) + (R1 -> R1)
	givenRE = (R1 -> R2) + (R2 -> R1) + (R3 -> R4) + (R4 -> R3) + (R5 -> R6) + (R6 -> R5) + (R7 -> R8) + (R8 -> R7) + (R9 -> R10) + (R10 -> R9) 
	givenE =  none -> none
}

assert min_rules_easy_some_inc_Assertion____R1____R2 {
	Consistency_r[min_rules_easy_some_inc, PersonPhone, PersonPhone, R1, R2]
}
check min_rules_easy_some_inc_Assertion____R1____R2 for 1

assert min_rules_easy_some_inc_Assertion____R3____R4 {
	Consistency_r[min_rules_easy_some_inc, PersonPhone, PersonPhone, R3, R4]
}
check min_rules_easy_some_inc_Assertion____R3____R4 for 1

assert min_rules_easy_some_inc_Assertion____R5____R6 {
	Consistency_r[min_rules_easy_some_inc, PersonPhone, PersonPhone, R5, R6]
}
check min_rules_easy_some_inc_Assertion____R5____R6 for 1

assert min_rules_easy_some_inc_Assertion____R7____R8 {
	Consistency_r[min_rules_easy_some_inc, PersonPhone, PersonPhone, R7, R8]
}
check min_rules_easy_some_inc_Assertion____R7____R8 for 1

assert min_rules_easy_some_inc_Assertion____R9____R10 {
	Consistency_r[min_rules_easy_some_inc, PersonPhone, PersonPhone, R9, R10]
}
check min_rules_easy_some_inc_Assertion____R9____R10 for 1


