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

one sig med_rules_hard_some_inc extends Scenario {
} {
	artifacts = PersonPhone
	rules = R2 + R3 + R4 + R5 + R6 + R7 + R8 + R9 + R10 + R20 + R12 + R11 + R14 + R13 + R16 + R15 + R18 + R17 + R19 + R1
	givenRM = (R1 -> R2) + (R2 -> R1) + (R3 -> R6) + (R3 -> R4) + (R3 -> R20) + (R3 -> R8) + (R3 -> R10) + (R3 -> R12) + (R3 -> R14) + (R3 -> R16) + (R3 -> R18) + (R4 -> R5) + (R4 -> R15) + (R4 -> R3) + (R4 -> R13) + (R4 -> R9) + (R4 -> R19) + (R4 -> R7) + (R4 -> R17) + (R4 -> R11) + (R5 -> R12) + (R5 -> R10) + (R5 -> R4) + (R5 -> R20) + (R5 -> R6) + (R5 -> R8) + (R5 -> R18) + (R5 -> R16) + (R5 -> R14) + (R6 -> R3) + (R6 -> R5) + (R6 -> R13) + (R6 -> R7) + (R6 -> R11) + (R6 -> R9) + (R6 -> R17) + (R6 -> R15) + (R6 -> R19) + (R7 -> R18) + (R7 -> R8) + (R7 -> R16) + (R7 -> R6) + (R7 -> R14) + (R7 -> R4) + (R7 -> R12) + (R7 -> R20) + (R7 -> R10) + (R8 -> R19) + (R8 -> R17) + (R8 -> R7) + (R8 -> R9) + (R8 -> R5) + (R8 -> R11) + (R8 -> R3) + (R8 -> R15) + (R8 -> R13) + (R9 -> R14) + (R9 -> R16) + (R9 -> R6) + (R9 -> R10) + (R9 -> R20) + (R9 -> R8) + (R9 -> R12) + (R9 -> R4) + (R9 -> R18) + (R10 -> R5) + (R10 -> R15) + (R10 -> R7) + (R10 -> R17) + (R10 -> R9) + (R10 -> R11) + (R10 -> R13) + (R10 -> R19) + (R10 -> R3) + (R11 -> R4) + (R11 -> R12) + (R11 -> R6) + (R11 -> R14) + (R11 -> R8) + (R11 -> R16) + (R11 -> R18) + (R11 -> R20) + (R11 -> R10) + (R12 -> R11) + (R12 -> R9) + (R12 -> R17) + (R12 -> R7) + (R12 -> R19) + (R12 -> R5) + (R12 -> R13) + (R12 -> R3) + (R12 -> R15) + (R13 -> R20) + (R13 -> R10) + (R13 -> R12) + (R13 -> R6) + (R13 -> R14) + (R13 -> R8) + (R13 -> R16) + (R13 -> R18) + (R13 -> R4) + (R14 -> R19) + (R14 -> R15) + (R14 -> R9) + (R14 -> R17) + (R14 -> R11) + (R14 -> R5) + (R14 -> R13) + (R14 -> R7) + (R14 -> R3) + (R15 -> R14) + (R15 -> R8) + (R15 -> R12) + (R15 -> R10) + (R15 -> R20) + (R15 -> R6) + (R15 -> R18) + (R15 -> R4) + (R15 -> R16) + (R16 -> R9) + (R16 -> R11) + (R16 -> R7) + (R16 -> R15) + (R16 -> R13) + (R16 -> R19) + (R16 -> R17) + (R16 -> R5) + (R16 -> R3) + (R17 -> R6) + (R17 -> R20) + (R17 -> R8) + (R17 -> R18) + (R17 -> R16) + (R17 -> R14) + (R17 -> R12) + (R17 -> R10) + (R17 -> R4) + (R18 -> R3) + (R18 -> R19) + (R18 -> R13) + (R18 -> R9) + (R18 -> R11) + (R18 -> R7) + (R18 -> R17) + (R18 -> R5) + (R18 -> R15) + (R19 -> R18) + (R19 -> R16) + (R19 -> R14) + (R19 -> R12) + (R19 -> R10) + (R19 -> R8) + (R19 -> R20) + (R19 -> R6) + (R19 -> R4) + (R20 -> R3) + (R20 -> R19) + (R20 -> R9) + (R20 -> R15) + (R20 -> R17) + (R20 -> R5) + (R20 -> R11) + (R20 -> R7) + (R20 -> R13) 
	givenTranslation = (R15 -> R15) + (R5 -> R5) + (R4 -> R4) + (R16 -> R16) + (R6 -> R6) + (R17 -> R17) + (R10 -> R10) + (R18 -> R18) + (R11 -> R11) + (R19 -> R19) + (R12 -> R12) + (R20 -> R20) + (R8 -> R8) + (R9 -> R9) + (R13 -> R13) + (R2 -> R2) + (R7 -> R7) + (R14 -> R14) + (R3 -> R3) + (R1 -> R1)
	givenRE = (R1 -> R2) + (R2 -> R1) + (R3 -> R6) + (R3 -> R4) + (R3 -> R20) + (R3 -> R8) + (R3 -> R10) + (R3 -> R12) + (R3 -> R14) + (R3 -> R16) + (R3 -> R18) + (R4 -> R5) + (R4 -> R15) + (R4 -> R3) + (R4 -> R13) + (R4 -> R9) + (R4 -> R19) + (R4 -> R7) + (R4 -> R17) + (R4 -> R11) + (R5 -> R12) + (R5 -> R10) + (R5 -> R4) + (R5 -> R20) + (R5 -> R6) + (R5 -> R8) + (R5 -> R18) + (R5 -> R16) + (R5 -> R14) + (R6 -> R3) + (R6 -> R5) + (R6 -> R13) + (R6 -> R7) + (R6 -> R11) + (R6 -> R9) + (R6 -> R17) + (R6 -> R15) + (R6 -> R19) + (R7 -> R18) + (R7 -> R8) + (R7 -> R16) + (R7 -> R6) + (R7 -> R14) + (R7 -> R4) + (R7 -> R12) + (R7 -> R20) + (R7 -> R10) + (R8 -> R19) + (R8 -> R17) + (R8 -> R7) + (R8 -> R9) + (R8 -> R5) + (R8 -> R11) + (R8 -> R3) + (R8 -> R15) + (R8 -> R13) + (R9 -> R14) + (R9 -> R16) + (R9 -> R6) + (R9 -> R10) + (R9 -> R20) + (R9 -> R8) + (R9 -> R12) + (R9 -> R4) + (R9 -> R18) + (R10 -> R5) + (R10 -> R15) + (R10 -> R7) + (R10 -> R17) + (R10 -> R9) + (R10 -> R11) + (R10 -> R13) + (R10 -> R19) + (R10 -> R3) + (R11 -> R4) + (R11 -> R12) + (R11 -> R6) + (R11 -> R14) + (R11 -> R8) + (R11 -> R16) + (R11 -> R18) + (R11 -> R20) + (R11 -> R10) + (R12 -> R11) + (R12 -> R9) + (R12 -> R17) + (R12 -> R7) + (R12 -> R19) + (R12 -> R5) + (R12 -> R13) + (R12 -> R3) + (R12 -> R15) + (R13 -> R20) + (R13 -> R10) + (R13 -> R12) + (R13 -> R6) + (R13 -> R14) + (R13 -> R8) + (R13 -> R16) + (R13 -> R18) + (R13 -> R4) + (R14 -> R19) + (R14 -> R15) + (R14 -> R9) + (R14 -> R17) + (R14 -> R11) + (R14 -> R5) + (R14 -> R13) + (R14 -> R7) + (R14 -> R3) + (R15 -> R14) + (R15 -> R8) + (R15 -> R12) + (R15 -> R10) + (R15 -> R20) + (R15 -> R6) + (R15 -> R18) + (R15 -> R4) + (R15 -> R16) + (R16 -> R9) + (R16 -> R11) + (R16 -> R7) + (R16 -> R15) + (R16 -> R13) + (R16 -> R19) + (R16 -> R17) + (R16 -> R5) + (R16 -> R3) + (R17 -> R6) + (R17 -> R20) + (R17 -> R8) + (R17 -> R18) + (R17 -> R16) + (R17 -> R14) + (R17 -> R12) + (R17 -> R10) + (R17 -> R4) + (R18 -> R3) + (R18 -> R19) + (R18 -> R13) + (R18 -> R9) + (R18 -> R11) + (R18 -> R7) + (R18 -> R17) + (R18 -> R5) + (R18 -> R15) + (R19 -> R18) + (R19 -> R16) + (R19 -> R14) + (R19 -> R12) + (R19 -> R10) + (R19 -> R8) + (R19 -> R20) + (R19 -> R6) + (R19 -> R4) + (R20 -> R3) + (R20 -> R19) + (R20 -> R9) + (R20 -> R15) + (R20 -> R17) + (R20 -> R5) + (R20 -> R11) + (R20 -> R7) + (R20 -> R13) 
	givenE =  none -> none
}

assert med_rules_hard_some_inc_Assertion____R1____R2 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R1, R2]
}
check med_rules_hard_some_inc_Assertion____R1____R2 for 1

assert med_rules_hard_some_inc_Assertion____R3____R4 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R4]
}
check med_rules_hard_some_inc_Assertion____R3____R4 for 1

assert med_rules_hard_some_inc_Assertion____R3____R6 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R6]
}
check med_rules_hard_some_inc_Assertion____R3____R6 for 1

assert med_rules_hard_some_inc_Assertion____R3____R8 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R8]
}
check med_rules_hard_some_inc_Assertion____R3____R8 for 1

assert med_rules_hard_some_inc_Assertion____R3____R10 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R10]
}
check med_rules_hard_some_inc_Assertion____R3____R10 for 1

assert med_rules_hard_some_inc_Assertion____R3____R12 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R12]
}
check med_rules_hard_some_inc_Assertion____R3____R12 for 1

assert med_rules_hard_some_inc_Assertion____R3____R14 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R14]
}
check med_rules_hard_some_inc_Assertion____R3____R14 for 1

assert med_rules_hard_some_inc_Assertion____R3____R16 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R16]
}
check med_rules_hard_some_inc_Assertion____R3____R16 for 1

assert med_rules_hard_some_inc_Assertion____R3____R18 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R18]
}
check med_rules_hard_some_inc_Assertion____R3____R18 for 1

assert med_rules_hard_some_inc_Assertion____R3____R20 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R20]
}
check med_rules_hard_some_inc_Assertion____R3____R20 for 1

assert med_rules_hard_some_inc_Assertion____R4____R5 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R5]
}
check med_rules_hard_some_inc_Assertion____R4____R5 for 1

assert med_rules_hard_some_inc_Assertion____R4____R7 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R7]
}
check med_rules_hard_some_inc_Assertion____R4____R7 for 1

assert med_rules_hard_some_inc_Assertion____R4____R9 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R9]
}
check med_rules_hard_some_inc_Assertion____R4____R9 for 1

assert med_rules_hard_some_inc_Assertion____R4____R11 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R11]
}
check med_rules_hard_some_inc_Assertion____R4____R11 for 1

assert med_rules_hard_some_inc_Assertion____R4____R13 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R13]
}
check med_rules_hard_some_inc_Assertion____R4____R13 for 1

assert med_rules_hard_some_inc_Assertion____R4____R15 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R15]
}
check med_rules_hard_some_inc_Assertion____R4____R15 for 1

assert med_rules_hard_some_inc_Assertion____R4____R17 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R17]
}
check med_rules_hard_some_inc_Assertion____R4____R17 for 1

assert med_rules_hard_some_inc_Assertion____R4____R19 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R19]
}
check med_rules_hard_some_inc_Assertion____R4____R19 for 1

assert med_rules_hard_some_inc_Assertion____R5____R6 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R6]
}
check med_rules_hard_some_inc_Assertion____R5____R6 for 1

assert med_rules_hard_some_inc_Assertion____R5____R8 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R8]
}
check med_rules_hard_some_inc_Assertion____R5____R8 for 1

assert med_rules_hard_some_inc_Assertion____R5____R10 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R10]
}
check med_rules_hard_some_inc_Assertion____R5____R10 for 1

assert med_rules_hard_some_inc_Assertion____R5____R12 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R12]
}
check med_rules_hard_some_inc_Assertion____R5____R12 for 1

assert med_rules_hard_some_inc_Assertion____R5____R14 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R14]
}
check med_rules_hard_some_inc_Assertion____R5____R14 for 1

assert med_rules_hard_some_inc_Assertion____R5____R16 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R16]
}
check med_rules_hard_some_inc_Assertion____R5____R16 for 1

assert med_rules_hard_some_inc_Assertion____R5____R18 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R18]
}
check med_rules_hard_some_inc_Assertion____R5____R18 for 1

assert med_rules_hard_some_inc_Assertion____R5____R20 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R20]
}
check med_rules_hard_some_inc_Assertion____R5____R20 for 1

assert med_rules_hard_some_inc_Assertion____R6____R7 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R7]
}
check med_rules_hard_some_inc_Assertion____R6____R7 for 1

assert med_rules_hard_some_inc_Assertion____R6____R9 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R9]
}
check med_rules_hard_some_inc_Assertion____R6____R9 for 1

assert med_rules_hard_some_inc_Assertion____R6____R11 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R11]
}
check med_rules_hard_some_inc_Assertion____R6____R11 for 1

assert med_rules_hard_some_inc_Assertion____R6____R13 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R13]
}
check med_rules_hard_some_inc_Assertion____R6____R13 for 1

assert med_rules_hard_some_inc_Assertion____R6____R15 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R15]
}
check med_rules_hard_some_inc_Assertion____R6____R15 for 1

assert med_rules_hard_some_inc_Assertion____R6____R17 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R17]
}
check med_rules_hard_some_inc_Assertion____R6____R17 for 1

assert med_rules_hard_some_inc_Assertion____R6____R19 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R19]
}
check med_rules_hard_some_inc_Assertion____R6____R19 for 1

assert med_rules_hard_some_inc_Assertion____R7____R8 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R8]
}
check med_rules_hard_some_inc_Assertion____R7____R8 for 1

assert med_rules_hard_some_inc_Assertion____R7____R10 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R10]
}
check med_rules_hard_some_inc_Assertion____R7____R10 for 1

assert med_rules_hard_some_inc_Assertion____R7____R12 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R12]
}
check med_rules_hard_some_inc_Assertion____R7____R12 for 1

assert med_rules_hard_some_inc_Assertion____R7____R14 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R14]
}
check med_rules_hard_some_inc_Assertion____R7____R14 for 1

assert med_rules_hard_some_inc_Assertion____R7____R16 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R16]
}
check med_rules_hard_some_inc_Assertion____R7____R16 for 1

assert med_rules_hard_some_inc_Assertion____R7____R18 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R18]
}
check med_rules_hard_some_inc_Assertion____R7____R18 for 1

assert med_rules_hard_some_inc_Assertion____R7____R20 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R20]
}
check med_rules_hard_some_inc_Assertion____R7____R20 for 1

assert med_rules_hard_some_inc_Assertion____R8____R9 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R9]
}
check med_rules_hard_some_inc_Assertion____R8____R9 for 1

assert med_rules_hard_some_inc_Assertion____R8____R11 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R11]
}
check med_rules_hard_some_inc_Assertion____R8____R11 for 1

assert med_rules_hard_some_inc_Assertion____R8____R13 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R13]
}
check med_rules_hard_some_inc_Assertion____R8____R13 for 1

assert med_rules_hard_some_inc_Assertion____R8____R15 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R15]
}
check med_rules_hard_some_inc_Assertion____R8____R15 for 1

assert med_rules_hard_some_inc_Assertion____R8____R17 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R17]
}
check med_rules_hard_some_inc_Assertion____R8____R17 for 1

assert med_rules_hard_some_inc_Assertion____R8____R19 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R19]
}
check med_rules_hard_some_inc_Assertion____R8____R19 for 1

assert med_rules_hard_some_inc_Assertion____R9____R10 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R10]
}
check med_rules_hard_some_inc_Assertion____R9____R10 for 1

assert med_rules_hard_some_inc_Assertion____R9____R12 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R12]
}
check med_rules_hard_some_inc_Assertion____R9____R12 for 1

assert med_rules_hard_some_inc_Assertion____R9____R14 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R14]
}
check med_rules_hard_some_inc_Assertion____R9____R14 for 1

assert med_rules_hard_some_inc_Assertion____R9____R16 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R16]
}
check med_rules_hard_some_inc_Assertion____R9____R16 for 1

assert med_rules_hard_some_inc_Assertion____R9____R18 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R18]
}
check med_rules_hard_some_inc_Assertion____R9____R18 for 1

assert med_rules_hard_some_inc_Assertion____R9____R20 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R20]
}
check med_rules_hard_some_inc_Assertion____R9____R20 for 1

assert med_rules_hard_some_inc_Assertion____R10____R11 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R11]
}
check med_rules_hard_some_inc_Assertion____R10____R11 for 1

assert med_rules_hard_some_inc_Assertion____R10____R13 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R13]
}
check med_rules_hard_some_inc_Assertion____R10____R13 for 1

assert med_rules_hard_some_inc_Assertion____R10____R15 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R15]
}
check med_rules_hard_some_inc_Assertion____R10____R15 for 1

assert med_rules_hard_some_inc_Assertion____R10____R17 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R17]
}
check med_rules_hard_some_inc_Assertion____R10____R17 for 1

assert med_rules_hard_some_inc_Assertion____R10____R19 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R19]
}
check med_rules_hard_some_inc_Assertion____R10____R19 for 1

assert med_rules_hard_some_inc_Assertion____R11____R12 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R12]
}
check med_rules_hard_some_inc_Assertion____R11____R12 for 1

assert med_rules_hard_some_inc_Assertion____R11____R14 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R14]
}
check med_rules_hard_some_inc_Assertion____R11____R14 for 1

assert med_rules_hard_some_inc_Assertion____R11____R16 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R16]
}
check med_rules_hard_some_inc_Assertion____R11____R16 for 1

assert med_rules_hard_some_inc_Assertion____R11____R18 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R18]
}
check med_rules_hard_some_inc_Assertion____R11____R18 for 1

assert med_rules_hard_some_inc_Assertion____R11____R20 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R20]
}
check med_rules_hard_some_inc_Assertion____R11____R20 for 1

assert med_rules_hard_some_inc_Assertion____R12____R13 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R13]
}
check med_rules_hard_some_inc_Assertion____R12____R13 for 1

assert med_rules_hard_some_inc_Assertion____R12____R15 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R15]
}
check med_rules_hard_some_inc_Assertion____R12____R15 for 1

assert med_rules_hard_some_inc_Assertion____R12____R17 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R17]
}
check med_rules_hard_some_inc_Assertion____R12____R17 for 1

assert med_rules_hard_some_inc_Assertion____R12____R19 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R19]
}
check med_rules_hard_some_inc_Assertion____R12____R19 for 1

assert med_rules_hard_some_inc_Assertion____R13____R14 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R14]
}
check med_rules_hard_some_inc_Assertion____R13____R14 for 1

assert med_rules_hard_some_inc_Assertion____R13____R16 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R16]
}
check med_rules_hard_some_inc_Assertion____R13____R16 for 1

assert med_rules_hard_some_inc_Assertion____R13____R18 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R18]
}
check med_rules_hard_some_inc_Assertion____R13____R18 for 1

assert med_rules_hard_some_inc_Assertion____R13____R20 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R20]
}
check med_rules_hard_some_inc_Assertion____R13____R20 for 1

assert med_rules_hard_some_inc_Assertion____R14____R15 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R15]
}
check med_rules_hard_some_inc_Assertion____R14____R15 for 1

assert med_rules_hard_some_inc_Assertion____R14____R17 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R17]
}
check med_rules_hard_some_inc_Assertion____R14____R17 for 1

assert med_rules_hard_some_inc_Assertion____R14____R19 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R19]
}
check med_rules_hard_some_inc_Assertion____R14____R19 for 1

assert med_rules_hard_some_inc_Assertion____R15____R16 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R16]
}
check med_rules_hard_some_inc_Assertion____R15____R16 for 1

assert med_rules_hard_some_inc_Assertion____R15____R18 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R18]
}
check med_rules_hard_some_inc_Assertion____R15____R18 for 1

assert med_rules_hard_some_inc_Assertion____R15____R20 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R20]
}
check med_rules_hard_some_inc_Assertion____R15____R20 for 1

assert med_rules_hard_some_inc_Assertion____R16____R17 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R17]
}
check med_rules_hard_some_inc_Assertion____R16____R17 for 1

assert med_rules_hard_some_inc_Assertion____R16____R19 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R19]
}
check med_rules_hard_some_inc_Assertion____R16____R19 for 1

assert med_rules_hard_some_inc_Assertion____R17____R18 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R18]
}
check med_rules_hard_some_inc_Assertion____R17____R18 for 1

assert med_rules_hard_some_inc_Assertion____R17____R20 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R20]
}
check med_rules_hard_some_inc_Assertion____R17____R20 for 1

assert med_rules_hard_some_inc_Assertion____R18____R19 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R18, R19]
}
check med_rules_hard_some_inc_Assertion____R18____R19 for 1

assert med_rules_hard_some_inc_Assertion____R19____R20 {
	Consistency_r[med_rules_hard_some_inc, PersonPhone, PersonPhone, R19, R20]
}
check med_rules_hard_some_inc_Assertion____R19____R20 for 1


