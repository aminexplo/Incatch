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
one sig R11 extends Rule {}
one sig R12 extends Rule {}

one sig twelve_rules_easy_some_inc extends Scenario {
} {
	artifacts = PersonPhone
	rules = R2 + R10 + R3 + R4 + R12 + R5 + R11 + R6 + R7 + R8 + R9 + R1
	givenRM = (R1 -> R7) + (R2 -> R8) + (R3 -> R9) + (R4 -> R10) + (R5 -> R11) + (R6 -> R12) + (R7 -> R1) + (R8 -> R2) + (R9 -> R3) + (R10 -> R4) + (R11 -> R5) + (R12 -> R6) 
	givenTranslation = (R5 -> R5) + (R12 -> R12) + (R4 -> R4) + (R6 -> R6) + (R8 -> R8) + (R9 -> R9) + (R2 -> R2) + (R7 -> R7) + (R10 -> R10) + (R3 -> R3) + (R1 -> R1) + (R11 -> R11)
	givenRE = (R1 -> R7) + (R2 -> R8) + (R3 -> R9) + (R4 -> R10) + (R5 -> R11) + (R6 -> R12) + (R7 -> R1) + (R8 -> R2) + (R9 -> R3) + (R10 -> R4) + (R11 -> R5) + (R12 -> R6) 
	givenE =  (PersonPhone -> R6) + (PersonPhone -> R5) + (PersonPhone -> R10) + (PersonPhone -> R4) + (PersonPhone -> R3) + (PersonPhone -> R12) + (PersonPhone -> R2) + (PersonPhone -> R11) + (PersonPhone -> R1)
}

assert twelve_rules_easy_some_inc_Assertion____R1____R7 {
	Consistency_r[twelve_rules_easy_some_inc, PersonPhone, PersonPhone, R1, R7]
}
check twelve_rules_easy_some_inc_Assertion____R1____R7 for 1

assert twelve_rules_easy_some_inc_Assertion____R2____R8 {
	Consistency_r[twelve_rules_easy_some_inc, PersonPhone, PersonPhone, R2, R8]
}
check twelve_rules_easy_some_inc_Assertion____R2____R8 for 1

assert twelve_rules_easy_some_inc_Assertion____R3____R9 {
	Consistency_r[twelve_rules_easy_some_inc, PersonPhone, PersonPhone, R3, R9]
}
check twelve_rules_easy_some_inc_Assertion____R3____R9 for 1

assert twelve_rules_easy_some_inc_Assertion____R4____R10 {
	Consistency_r[twelve_rules_easy_some_inc, PersonPhone, PersonPhone, R4, R10]
}
check twelve_rules_easy_some_inc_Assertion____R4____R10 for 1

assert twelve_rules_easy_some_inc_Assertion____R5____R11 {
	Consistency_r[twelve_rules_easy_some_inc, PersonPhone, PersonPhone, R5, R11]
}
check twelve_rules_easy_some_inc_Assertion____R5____R11 for 1

assert twelve_rules_easy_some_inc_Assertion____R6____R12 {
	Consistency_r[twelve_rules_easy_some_inc, PersonPhone, PersonPhone, R6, R12]
}
check twelve_rules_easy_some_inc_Assertion____R6____R12 for 1


