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

one sig sixteen_rules_hard_all_inc extends Scenario {
} {
	artifacts = PersonPhone
	rules = R2 + R3 + R4 + R5 + R6 + R7 + R8 + R9 + R10 + R12 + R11 + R14 + R13 + R16 + R15 + R1
	givenRM = (R1 -> R9) + (R2 -> R14) + (R2 -> R15) + (R2 -> R16) + (R2 -> R10) + (R2 -> R11) + (R2 -> R12) + (R2 -> R13) + (R3 -> R10) + (R3 -> R11) + (R3 -> R12) + (R3 -> R13) + (R3 -> R14) + (R3 -> R15) + (R3 -> R16) + (R4 -> R15) + (R4 -> R14) + (R4 -> R13) + (R4 -> R12) + (R4 -> R16) + (R4 -> R11) + (R4 -> R10) + (R5 -> R12) + (R5 -> R11) + (R5 -> R10) + (R5 -> R16) + (R5 -> R15) + (R5 -> R14) + (R5 -> R13) + (R6 -> R12) + (R6 -> R13) + (R6 -> R10) + (R6 -> R11) + (R6 -> R16) + (R6 -> R14) + (R6 -> R15) + (R7 -> R15) + (R7 -> R16) + (R7 -> R13) + (R7 -> R14) + (R7 -> R11) + (R7 -> R12) + (R7 -> R10) + (R8 -> R16) + (R8 -> R10) + (R8 -> R11) + (R8 -> R14) + (R8 -> R15) + (R8 -> R12) + (R8 -> R13) + (R9 -> R1) + (R10 -> R5) + (R10 -> R4) + (R10 -> R7) + (R10 -> R6) + (R10 -> R8) + (R10 -> R3) + (R10 -> R2) + (R11 -> R3) + (R11 -> R4) + (R11 -> R5) + (R11 -> R6) + (R11 -> R7) + (R11 -> R8) + (R11 -> R2) + (R12 -> R8) + (R12 -> R6) + (R12 -> R7) + (R12 -> R4) + (R12 -> R5) + (R12 -> R2) + (R12 -> R3) + (R13 -> R6) + (R13 -> R5) + (R13 -> R8) + (R13 -> R7) + (R13 -> R2) + (R13 -> R4) + (R13 -> R3) + (R14 -> R8) + (R14 -> R4) + (R14 -> R5) + (R14 -> R6) + (R14 -> R7) + (R14 -> R2) + (R14 -> R3) + (R15 -> R8) + (R15 -> R7) + (R15 -> R2) + (R15 -> R6) + (R15 -> R5) + (R15 -> R4) + (R15 -> R3) + (R16 -> R8) + (R16 -> R6) + (R16 -> R7) + (R16 -> R4) + (R16 -> R5) + (R16 -> R2) + (R16 -> R3) 
	givenTranslation = (R15 -> R15) + (R5 -> R5) + (R4 -> R4) + (R16 -> R16) + (R6 -> R6) + (R10 -> R10) + (R11 -> R11) + (R12 -> R12) + (R8 -> R8) + (R9 -> R9) + (R13 -> R13) + (R2 -> R2) + (R7 -> R7) + (R14 -> R14) + (R3 -> R3) + (R1 -> R1)
	givenRE = (R1 -> R9) + (R2 -> R14) + (R2 -> R15) + (R2 -> R16) + (R2 -> R10) + (R2 -> R11) + (R2 -> R12) + (R2 -> R13) + (R3 -> R10) + (R3 -> R11) + (R3 -> R12) + (R3 -> R13) + (R3 -> R14) + (R3 -> R15) + (R3 -> R16) + (R4 -> R15) + (R4 -> R14) + (R4 -> R13) + (R4 -> R12) + (R4 -> R16) + (R4 -> R11) + (R4 -> R10) + (R5 -> R12) + (R5 -> R11) + (R5 -> R10) + (R5 -> R16) + (R5 -> R15) + (R5 -> R14) + (R5 -> R13) + (R6 -> R12) + (R6 -> R13) + (R6 -> R10) + (R6 -> R11) + (R6 -> R16) + (R6 -> R14) + (R6 -> R15) + (R7 -> R15) + (R7 -> R16) + (R7 -> R13) + (R7 -> R14) + (R7 -> R11) + (R7 -> R12) + (R7 -> R10) + (R8 -> R16) + (R8 -> R10) + (R8 -> R11) + (R8 -> R14) + (R8 -> R15) + (R8 -> R12) + (R8 -> R13) + (R9 -> R1) + (R10 -> R5) + (R10 -> R4) + (R10 -> R7) + (R10 -> R6) + (R10 -> R8) + (R10 -> R3) + (R10 -> R2) + (R11 -> R3) + (R11 -> R4) + (R11 -> R5) + (R11 -> R6) + (R11 -> R7) + (R11 -> R8) + (R11 -> R2) + (R12 -> R8) + (R12 -> R6) + (R12 -> R7) + (R12 -> R4) + (R12 -> R5) + (R12 -> R2) + (R12 -> R3) + (R13 -> R6) + (R13 -> R5) + (R13 -> R8) + (R13 -> R7) + (R13 -> R2) + (R13 -> R4) + (R13 -> R3) + (R14 -> R8) + (R14 -> R4) + (R14 -> R5) + (R14 -> R6) + (R14 -> R7) + (R14 -> R2) + (R14 -> R3) + (R15 -> R8) + (R15 -> R7) + (R15 -> R2) + (R15 -> R6) + (R15 -> R5) + (R15 -> R4) + (R15 -> R3) + (R16 -> R8) + (R16 -> R6) + (R16 -> R7) + (R16 -> R4) + (R16 -> R5) + (R16 -> R2) + (R16 -> R3) 
	givenE =  (PersonPhone -> R7) + (PersonPhone -> R6) + (PersonPhone -> R5) + (PersonPhone -> R4) + (PersonPhone -> R8) + (PersonPhone -> R3) + (PersonPhone -> R2) + (PersonPhone -> R1)
}

assert sixteen_rules_hard_all_inc_Assertion____R1____R9 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R1, R9]
}
check sixteen_rules_hard_all_inc_Assertion____R1____R9 for 1

assert sixteen_rules_hard_all_inc_Assertion____R2____R10 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R10]
}
check sixteen_rules_hard_all_inc_Assertion____R2____R10 for 1

assert sixteen_rules_hard_all_inc_Assertion____R2____R11 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R11]
}
check sixteen_rules_hard_all_inc_Assertion____R2____R11 for 1

assert sixteen_rules_hard_all_inc_Assertion____R2____R12 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R12]
}
check sixteen_rules_hard_all_inc_Assertion____R2____R12 for 1

assert sixteen_rules_hard_all_inc_Assertion____R2____R13 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R13]
}
check sixteen_rules_hard_all_inc_Assertion____R2____R13 for 1

assert sixteen_rules_hard_all_inc_Assertion____R2____R14 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R14]
}
check sixteen_rules_hard_all_inc_Assertion____R2____R14 for 1

assert sixteen_rules_hard_all_inc_Assertion____R2____R15 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R15]
}
check sixteen_rules_hard_all_inc_Assertion____R2____R15 for 1

assert sixteen_rules_hard_all_inc_Assertion____R2____R16 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R2, R16]
}
check sixteen_rules_hard_all_inc_Assertion____R2____R16 for 1

assert sixteen_rules_hard_all_inc_Assertion____R3____R10 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R10]
}
check sixteen_rules_hard_all_inc_Assertion____R3____R10 for 1

assert sixteen_rules_hard_all_inc_Assertion____R3____R11 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R11]
}
check sixteen_rules_hard_all_inc_Assertion____R3____R11 for 1

assert sixteen_rules_hard_all_inc_Assertion____R3____R12 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R12]
}
check sixteen_rules_hard_all_inc_Assertion____R3____R12 for 1

assert sixteen_rules_hard_all_inc_Assertion____R3____R13 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R13]
}
check sixteen_rules_hard_all_inc_Assertion____R3____R13 for 1

assert sixteen_rules_hard_all_inc_Assertion____R3____R14 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R14]
}
check sixteen_rules_hard_all_inc_Assertion____R3____R14 for 1

assert sixteen_rules_hard_all_inc_Assertion____R3____R15 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R15]
}
check sixteen_rules_hard_all_inc_Assertion____R3____R15 for 1

assert sixteen_rules_hard_all_inc_Assertion____R3____R16 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R3, R16]
}
check sixteen_rules_hard_all_inc_Assertion____R3____R16 for 1

assert sixteen_rules_hard_all_inc_Assertion____R4____R10 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R10]
}
check sixteen_rules_hard_all_inc_Assertion____R4____R10 for 1

assert sixteen_rules_hard_all_inc_Assertion____R4____R11 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R11]
}
check sixteen_rules_hard_all_inc_Assertion____R4____R11 for 1

assert sixteen_rules_hard_all_inc_Assertion____R4____R12 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R12]
}
check sixteen_rules_hard_all_inc_Assertion____R4____R12 for 1

assert sixteen_rules_hard_all_inc_Assertion____R4____R13 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R13]
}
check sixteen_rules_hard_all_inc_Assertion____R4____R13 for 1

assert sixteen_rules_hard_all_inc_Assertion____R4____R14 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R14]
}
check sixteen_rules_hard_all_inc_Assertion____R4____R14 for 1

assert sixteen_rules_hard_all_inc_Assertion____R4____R15 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R15]
}
check sixteen_rules_hard_all_inc_Assertion____R4____R15 for 1

assert sixteen_rules_hard_all_inc_Assertion____R4____R16 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R4, R16]
}
check sixteen_rules_hard_all_inc_Assertion____R4____R16 for 1

assert sixteen_rules_hard_all_inc_Assertion____R5____R10 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R5, R10]
}
check sixteen_rules_hard_all_inc_Assertion____R5____R10 for 1

assert sixteen_rules_hard_all_inc_Assertion____R5____R11 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R5, R11]
}
check sixteen_rules_hard_all_inc_Assertion____R5____R11 for 1

assert sixteen_rules_hard_all_inc_Assertion____R5____R12 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R5, R12]
}
check sixteen_rules_hard_all_inc_Assertion____R5____R12 for 1

assert sixteen_rules_hard_all_inc_Assertion____R5____R13 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R5, R13]
}
check sixteen_rules_hard_all_inc_Assertion____R5____R13 for 1

assert sixteen_rules_hard_all_inc_Assertion____R5____R14 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R5, R14]
}
check sixteen_rules_hard_all_inc_Assertion____R5____R14 for 1

assert sixteen_rules_hard_all_inc_Assertion____R5____R15 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R5, R15]
}
check sixteen_rules_hard_all_inc_Assertion____R5____R15 for 1

assert sixteen_rules_hard_all_inc_Assertion____R5____R16 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R5, R16]
}
check sixteen_rules_hard_all_inc_Assertion____R5____R16 for 1

assert sixteen_rules_hard_all_inc_Assertion____R6____R10 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R6, R10]
}
check sixteen_rules_hard_all_inc_Assertion____R6____R10 for 1

assert sixteen_rules_hard_all_inc_Assertion____R6____R11 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R6, R11]
}
check sixteen_rules_hard_all_inc_Assertion____R6____R11 for 1

assert sixteen_rules_hard_all_inc_Assertion____R6____R12 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R6, R12]
}
check sixteen_rules_hard_all_inc_Assertion____R6____R12 for 1

assert sixteen_rules_hard_all_inc_Assertion____R6____R13 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R6, R13]
}
check sixteen_rules_hard_all_inc_Assertion____R6____R13 for 1

assert sixteen_rules_hard_all_inc_Assertion____R6____R14 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R6, R14]
}
check sixteen_rules_hard_all_inc_Assertion____R6____R14 for 1

assert sixteen_rules_hard_all_inc_Assertion____R6____R15 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R6, R15]
}
check sixteen_rules_hard_all_inc_Assertion____R6____R15 for 1

assert sixteen_rules_hard_all_inc_Assertion____R6____R16 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R6, R16]
}
check sixteen_rules_hard_all_inc_Assertion____R6____R16 for 1

assert sixteen_rules_hard_all_inc_Assertion____R7____R10 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R7, R10]
}
check sixteen_rules_hard_all_inc_Assertion____R7____R10 for 1

assert sixteen_rules_hard_all_inc_Assertion____R7____R11 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R7, R11]
}
check sixteen_rules_hard_all_inc_Assertion____R7____R11 for 1

assert sixteen_rules_hard_all_inc_Assertion____R7____R12 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R7, R12]
}
check sixteen_rules_hard_all_inc_Assertion____R7____R12 for 1

assert sixteen_rules_hard_all_inc_Assertion____R7____R13 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R7, R13]
}
check sixteen_rules_hard_all_inc_Assertion____R7____R13 for 1

assert sixteen_rules_hard_all_inc_Assertion____R7____R14 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R7, R14]
}
check sixteen_rules_hard_all_inc_Assertion____R7____R14 for 1

assert sixteen_rules_hard_all_inc_Assertion____R7____R15 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R7, R15]
}
check sixteen_rules_hard_all_inc_Assertion____R7____R15 for 1

assert sixteen_rules_hard_all_inc_Assertion____R7____R16 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R7, R16]
}
check sixteen_rules_hard_all_inc_Assertion____R7____R16 for 1

assert sixteen_rules_hard_all_inc_Assertion____R8____R10 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R8, R10]
}
check sixteen_rules_hard_all_inc_Assertion____R8____R10 for 1

assert sixteen_rules_hard_all_inc_Assertion____R8____R11 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R8, R11]
}
check sixteen_rules_hard_all_inc_Assertion____R8____R11 for 1

assert sixteen_rules_hard_all_inc_Assertion____R8____R12 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R8, R12]
}
check sixteen_rules_hard_all_inc_Assertion____R8____R12 for 1

assert sixteen_rules_hard_all_inc_Assertion____R8____R13 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R8, R13]
}
check sixteen_rules_hard_all_inc_Assertion____R8____R13 for 1

assert sixteen_rules_hard_all_inc_Assertion____R8____R14 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R8, R14]
}
check sixteen_rules_hard_all_inc_Assertion____R8____R14 for 1

assert sixteen_rules_hard_all_inc_Assertion____R8____R15 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R8, R15]
}
check sixteen_rules_hard_all_inc_Assertion____R8____R15 for 1

assert sixteen_rules_hard_all_inc_Assertion____R8____R16 {
	Consistency_r[sixteen_rules_hard_all_inc, PersonPhone, PersonPhone, R8, R16]
}
check sixteen_rules_hard_all_inc_Assertion____R8____R16 for 1


