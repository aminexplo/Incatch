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
one sig R13 extends Rule {}
one sig R14 extends Rule {}
one sig R15 extends Rule {}
one sig R16 extends Rule {}
one sig R17 extends Rule {}
one sig R18 extends Rule {}
one sig R19 extends Rule {}
one sig R20 extends Rule {}

one sig med_rules_easy_no_inc extends Scenario {
} {
	artifacts = PersonPhone
	rules = R2 + R3 + R4 + R5 + R6 + R7 + R8 + R9 + R10 + R20 + R12 + R11 + R14 + R13 + R16 + R15 + R18 + R17 + R19 + R1
	givenRM = (R1 -> R2) + (R2 -> R1) + (R3 -> R4) + (R4 -> R3) + (R5 -> R6) + (R6 -> R5) + (R7 -> R8) + (R8 -> R7) + (R9 -> R10) + (R10 -> R9) + (R11 -> R12) + (R12 -> R11) + (R13 -> R14) + (R14 -> R13) + (R15 -> R16) + (R16 -> R15) + (R17 -> R18) + (R18 -> R17) + (R19 -> R20) + (R20 -> R19) 
	givenTranslation = (R15 -> R15) + (R5 -> R5) + (R4 -> R4) + (R16 -> R16) + (R6 -> R6) + (R17 -> R17) + (R10 -> R10) + (R18 -> R18) + (R11 -> R11) + (R19 -> R19) + (R12 -> R12) + (R20 -> R20) + (R8 -> R8) + (R9 -> R9) + (R13 -> R13) + (R2 -> R2) + (R7 -> R7) + (R14 -> R14) + (R3 -> R3) + (R1 -> R1)
	givenRE = (R1 -> R2) + (R2 -> R1) + (R3 -> R4) + (R4 -> R3) + (R5 -> R6) + (R6 -> R5) + (R7 -> R8) + (R8 -> R7) + (R9 -> R10) + (R10 -> R9) + (R11 -> R12) + (R12 -> R11) + (R13 -> R14) + (R14 -> R13) + (R15 -> R16) + (R16 -> R15) + (R17 -> R18) + (R18 -> R17) + (R19 -> R20) + (R20 -> R19) 
	givenE =  none -> none
}

assert med_rules_easy_no_inc_Assertion____R1____R2 {
	Consistency_r[med_rules_easy_no_inc, PersonPhone, PersonPhone, R1, R2]
}
check med_rules_easy_no_inc_Assertion____R1____R2 for 1

assert med_rules_easy_no_inc_Assertion____R3____R4 {
	Consistency_r[med_rules_easy_no_inc, PersonPhone, PersonPhone, R3, R4]
}
check med_rules_easy_no_inc_Assertion____R3____R4 for 1

assert med_rules_easy_no_inc_Assertion____R5____R6 {
	Consistency_r[med_rules_easy_no_inc, PersonPhone, PersonPhone, R5, R6]
}
check med_rules_easy_no_inc_Assertion____R5____R6 for 1

assert med_rules_easy_no_inc_Assertion____R7____R8 {
	Consistency_r[med_rules_easy_no_inc, PersonPhone, PersonPhone, R7, R8]
}
check med_rules_easy_no_inc_Assertion____R7____R8 for 1

assert med_rules_easy_no_inc_Assertion____R9____R10 {
	Consistency_r[med_rules_easy_no_inc, PersonPhone, PersonPhone, R9, R10]
}
check med_rules_easy_no_inc_Assertion____R9____R10 for 1

assert med_rules_easy_no_inc_Assertion____R11____R12 {
	Consistency_r[med_rules_easy_no_inc, PersonPhone, PersonPhone, R11, R12]
}
check med_rules_easy_no_inc_Assertion____R11____R12 for 1

assert med_rules_easy_no_inc_Assertion____R13____R14 {
	Consistency_r[med_rules_easy_no_inc, PersonPhone, PersonPhone, R13, R14]
}
check med_rules_easy_no_inc_Assertion____R13____R14 for 1

assert med_rules_easy_no_inc_Assertion____R15____R16 {
	Consistency_r[med_rules_easy_no_inc, PersonPhone, PersonPhone, R15, R16]
}
check med_rules_easy_no_inc_Assertion____R15____R16 for 1

assert med_rules_easy_no_inc_Assertion____R17____R18 {
	Consistency_r[med_rules_easy_no_inc, PersonPhone, PersonPhone, R17, R18]
}
check med_rules_easy_no_inc_Assertion____R17____R18 for 1

assert med_rules_easy_no_inc_Assertion____R19____R20 {
	Consistency_r[med_rules_easy_no_inc, PersonPhone, PersonPhone, R19, R20]
}
check med_rules_easy_no_inc_Assertion____R19____R20 for 1


