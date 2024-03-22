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

one sig ten_rules_hard_all_inc extends Scenario {
} {
	artifacts = PersonPhone
	rules = R2 + R10 + R3 + R4 + R5 + R6 + R7 + R8 + R9 + R1
	givenRM = (R2 -> R9) + (R2 -> R6) + (R2 -> R5) + (R2 -> R8) + (R2 -> R7) + (R2 -> R1) + (R2 -> R4) + (R2 -> R3) + (R2 -> R10) + (R3 -> R7) + (R3 -> R6) + (R3 -> R5) + (R3 -> R4) + (R3 -> R9) + (R3 -> R8) + (R3 -> R10) + (R3 -> R2) + (R3 -> R1) + (R1 -> R10) + (R1 -> R8) + (R1 -> R9) + (R1 -> R6) + (R1 -> R7) + (R1 -> R4) + (R1 -> R5) + (R1 -> R2) + (R1 -> R3) + (R4 -> R5) + (R4 -> R6) + (R4 -> R3) + (R4 -> R9) + (R4 -> R7) + (R4 -> R8) + (R4 -> R1) + (R4 -> R2) + (R4 -> R10) + (R5 -> R3) + (R5 -> R2) + (R5 -> R10) + (R5 -> R4) + (R5 -> R7) + (R5 -> R6) + (R5 -> R9) + (R5 -> R8) + (R5 -> R1) + (R6 -> R1) + (R6 -> R2) + (R6 -> R3) + (R6 -> R4) + (R6 -> R5) + (R6 -> R7) + (R6 -> R10) + (R6 -> R8) + (R6 -> R9) + (R7 -> R9) + (R7 -> R8) + (R7 -> R6) + (R7 -> R5) + (R7 -> R4) + (R7 -> R3) + (R7 -> R2) + (R7 -> R10) + (R7 -> R1) + (R8 -> R7) + (R8 -> R9) + (R8 -> R5) + (R8 -> R10) + (R8 -> R6) + (R8 -> R3) + (R8 -> R4) + (R8 -> R1) + (R8 -> R2) + (R9 -> R6) + (R9 -> R10) + (R9 -> R7) + (R9 -> R8) + (R9 -> R2) + (R9 -> R3) + (R9 -> R4) + (R9 -> R5) + (R9 -> R1) + (R10 -> R5) + (R10 -> R4) + (R10 -> R7) + (R10 -> R6) + (R10 -> R9) + (R10 -> R8) + (R10 -> R1) + (R10 -> R3) + (R10 -> R2) 
	givenTranslation = (R5 -> R5) + (R4 -> R4) + (R6 -> R6) + (R8 -> R8) + (R9 -> R9) + (R2 -> R2) + (R7 -> R7) + (R10 -> R10) + (R3 -> R3) + (R1 -> R1)
	givenRE = (R2 -> R9) + (R2 -> R6) + (R2 -> R5) + (R2 -> R8) + (R2 -> R7) + (R2 -> R1) + (R2 -> R4) + (R2 -> R3) + (R2 -> R10) + (R3 -> R7) + (R3 -> R6) + (R3 -> R5) + (R3 -> R4) + (R3 -> R9) + (R3 -> R8) + (R3 -> R10) + (R3 -> R2) + (R3 -> R1) + (R1 -> R10) + (R1 -> R8) + (R1 -> R9) + (R1 -> R6) + (R1 -> R7) + (R1 -> R4) + (R1 -> R5) + (R1 -> R2) + (R1 -> R3) + (R4 -> R5) + (R4 -> R6) + (R4 -> R3) + (R4 -> R9) + (R4 -> R7) + (R4 -> R8) + (R4 -> R1) + (R4 -> R2) + (R4 -> R10) + (R5 -> R3) + (R5 -> R2) + (R5 -> R10) + (R5 -> R4) + (R5 -> R7) + (R5 -> R6) + (R5 -> R9) + (R5 -> R8) + (R5 -> R1) + (R6 -> R1) + (R6 -> R2) + (R6 -> R3) + (R6 -> R4) + (R6 -> R5) + (R6 -> R7) + (R6 -> R10) + (R6 -> R8) + (R6 -> R9) + (R7 -> R9) + (R7 -> R8) + (R7 -> R6) + (R7 -> R5) + (R7 -> R4) + (R7 -> R3) + (R7 -> R2) + (R7 -> R10) + (R7 -> R1) + (R8 -> R7) + (R8 -> R9) + (R8 -> R5) + (R8 -> R10) + (R8 -> R6) + (R8 -> R3) + (R8 -> R4) + (R8 -> R1) + (R8 -> R2) + (R9 -> R6) + (R9 -> R10) + (R9 -> R7) + (R9 -> R8) + (R9 -> R2) + (R9 -> R3) + (R9 -> R4) + (R9 -> R5) + (R9 -> R1) + (R10 -> R5) + (R10 -> R4) + (R10 -> R7) + (R10 -> R6) + (R10 -> R9) + (R10 -> R8) + (R10 -> R1) + (R10 -> R3) + (R10 -> R2) 
	givenE =  none -> none
}

assert ten_rules_hard_all_inc_Assertion____R2____R3 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R3]
}
check ten_rules_hard_all_inc_Assertion____R2____R3 for 1

assert ten_rules_hard_all_inc_Assertion____R2____R1 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R1]
}
check ten_rules_hard_all_inc_Assertion____R2____R1 for 1

assert ten_rules_hard_all_inc_Assertion____R2____R4 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R4]
}
check ten_rules_hard_all_inc_Assertion____R2____R4 for 1

assert ten_rules_hard_all_inc_Assertion____R2____R5 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R5]
}
check ten_rules_hard_all_inc_Assertion____R2____R5 for 1

assert ten_rules_hard_all_inc_Assertion____R2____R6 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R6]
}
check ten_rules_hard_all_inc_Assertion____R2____R6 for 1

assert ten_rules_hard_all_inc_Assertion____R2____R7 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R7]
}
check ten_rules_hard_all_inc_Assertion____R2____R7 for 1

assert ten_rules_hard_all_inc_Assertion____R2____R8 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R8]
}
check ten_rules_hard_all_inc_Assertion____R2____R8 for 1

assert ten_rules_hard_all_inc_Assertion____R2____R9 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R9]
}
check ten_rules_hard_all_inc_Assertion____R2____R9 for 1

assert ten_rules_hard_all_inc_Assertion____R2____R10 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R10]
}
check ten_rules_hard_all_inc_Assertion____R2____R10 for 1

assert ten_rules_hard_all_inc_Assertion____R3____R1 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R1]
}
check ten_rules_hard_all_inc_Assertion____R3____R1 for 1

assert ten_rules_hard_all_inc_Assertion____R3____R4 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R4]
}
check ten_rules_hard_all_inc_Assertion____R3____R4 for 1

assert ten_rules_hard_all_inc_Assertion____R3____R5 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R5]
}
check ten_rules_hard_all_inc_Assertion____R3____R5 for 1

assert ten_rules_hard_all_inc_Assertion____R3____R6 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R6]
}
check ten_rules_hard_all_inc_Assertion____R3____R6 for 1

assert ten_rules_hard_all_inc_Assertion____R3____R7 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R7]
}
check ten_rules_hard_all_inc_Assertion____R3____R7 for 1

assert ten_rules_hard_all_inc_Assertion____R3____R8 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R8]
}
check ten_rules_hard_all_inc_Assertion____R3____R8 for 1

assert ten_rules_hard_all_inc_Assertion____R3____R9 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R9]
}
check ten_rules_hard_all_inc_Assertion____R3____R9 for 1

assert ten_rules_hard_all_inc_Assertion____R3____R10 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R10]
}
check ten_rules_hard_all_inc_Assertion____R3____R10 for 1

assert ten_rules_hard_all_inc_Assertion____R1____R4 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R1, R4]
}
check ten_rules_hard_all_inc_Assertion____R1____R4 for 1

assert ten_rules_hard_all_inc_Assertion____R1____R5 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R1, R5]
}
check ten_rules_hard_all_inc_Assertion____R1____R5 for 1

assert ten_rules_hard_all_inc_Assertion____R1____R6 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R1, R6]
}
check ten_rules_hard_all_inc_Assertion____R1____R6 for 1

assert ten_rules_hard_all_inc_Assertion____R1____R7 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R1, R7]
}
check ten_rules_hard_all_inc_Assertion____R1____R7 for 1

assert ten_rules_hard_all_inc_Assertion____R1____R8 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R1, R8]
}
check ten_rules_hard_all_inc_Assertion____R1____R8 for 1

assert ten_rules_hard_all_inc_Assertion____R1____R9 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R1, R9]
}
check ten_rules_hard_all_inc_Assertion____R1____R9 for 1

assert ten_rules_hard_all_inc_Assertion____R1____R10 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R1, R10]
}
check ten_rules_hard_all_inc_Assertion____R1____R10 for 1

assert ten_rules_hard_all_inc_Assertion____R4____R5 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R5]
}
check ten_rules_hard_all_inc_Assertion____R4____R5 for 1

assert ten_rules_hard_all_inc_Assertion____R4____R6 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R6]
}
check ten_rules_hard_all_inc_Assertion____R4____R6 for 1

assert ten_rules_hard_all_inc_Assertion____R4____R7 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R7]
}
check ten_rules_hard_all_inc_Assertion____R4____R7 for 1

assert ten_rules_hard_all_inc_Assertion____R4____R8 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R8]
}
check ten_rules_hard_all_inc_Assertion____R4____R8 for 1

assert ten_rules_hard_all_inc_Assertion____R4____R9 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R9]
}
check ten_rules_hard_all_inc_Assertion____R4____R9 for 1

assert ten_rules_hard_all_inc_Assertion____R4____R10 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R10]
}
check ten_rules_hard_all_inc_Assertion____R4____R10 for 1

assert ten_rules_hard_all_inc_Assertion____R5____R6 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R5, R6]
}
check ten_rules_hard_all_inc_Assertion____R5____R6 for 1

assert ten_rules_hard_all_inc_Assertion____R5____R7 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R5, R7]
}
check ten_rules_hard_all_inc_Assertion____R5____R7 for 1

assert ten_rules_hard_all_inc_Assertion____R5____R8 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R5, R8]
}
check ten_rules_hard_all_inc_Assertion____R5____R8 for 1

assert ten_rules_hard_all_inc_Assertion____R5____R9 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R5, R9]
}
check ten_rules_hard_all_inc_Assertion____R5____R9 for 1

assert ten_rules_hard_all_inc_Assertion____R5____R10 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R5, R10]
}
check ten_rules_hard_all_inc_Assertion____R5____R10 for 1

assert ten_rules_hard_all_inc_Assertion____R6____R7 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R6, R7]
}
check ten_rules_hard_all_inc_Assertion____R6____R7 for 1

assert ten_rules_hard_all_inc_Assertion____R6____R8 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R6, R8]
}
check ten_rules_hard_all_inc_Assertion____R6____R8 for 1

assert ten_rules_hard_all_inc_Assertion____R6____R9 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R6, R9]
}
check ten_rules_hard_all_inc_Assertion____R6____R9 for 1

assert ten_rules_hard_all_inc_Assertion____R6____R10 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R6, R10]
}
check ten_rules_hard_all_inc_Assertion____R6____R10 for 1

assert ten_rules_hard_all_inc_Assertion____R7____R8 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R7, R8]
}
check ten_rules_hard_all_inc_Assertion____R7____R8 for 1

assert ten_rules_hard_all_inc_Assertion____R7____R9 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R7, R9]
}
check ten_rules_hard_all_inc_Assertion____R7____R9 for 1

assert ten_rules_hard_all_inc_Assertion____R7____R10 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R7, R10]
}
check ten_rules_hard_all_inc_Assertion____R7____R10 for 1

assert ten_rules_hard_all_inc_Assertion____R8____R9 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R8, R9]
}
check ten_rules_hard_all_inc_Assertion____R8____R9 for 1

assert ten_rules_hard_all_inc_Assertion____R8____R10 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R8, R10]
}
check ten_rules_hard_all_inc_Assertion____R8____R10 for 1

assert ten_rules_hard_all_inc_Assertion____R9____R10 {
	Consistency_r[ten_rules_hard_all_inc, PersonPhone, PersonPhone, R9, R10]
}
check ten_rules_hard_all_inc_Assertion____R9____R10 for 1


