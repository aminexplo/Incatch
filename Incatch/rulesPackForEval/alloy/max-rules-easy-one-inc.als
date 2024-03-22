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
one sig R21 extends Rule {}
one sig R22 extends Rule {}
one sig R23 extends Rule {}
one sig R24 extends Rule {}
one sig R25 extends Rule {}
one sig R26 extends Rule {}
one sig R27 extends Rule {}
one sig R28 extends Rule {}
one sig R29 extends Rule {}
one sig R30 extends Rule {}
one sig R31 extends Rule {}
one sig R32 extends Rule {}
one sig R33 extends Rule {}
one sig R34 extends Rule {}
one sig R35 extends Rule {}
one sig R36 extends Rule {}
one sig R37 extends Rule {}
one sig R38 extends Rule {}
one sig R39 extends Rule {}
one sig R40 extends Rule {}

one sig max_rules_easy_one_inc extends Scenario {
} {
	artifacts = PersonPhone
	rules = R40 + R21 + R20 + R23 + R22 + R25 + R24 + R27 + R26 + R29 + R28 + R1 + R2 + R3 + R4 + R5 + R6 + R7 + R8 + R9 + R30 + R10 + R32 + R31 + R12 + R34 + R11 + R33 + R14 + R36 + R13 + R35 + R16 + R38 + R15 + R37 + R18 + R17 + R39 + R19
	givenRM = (R1 -> R2) + (R2 -> R1) + (R3 -> R4) + (R4 -> R3) + (R5 -> R6) + (R6 -> R5) + (R7 -> R8) + (R8 -> R7) + (R9 -> R10) + (R10 -> R9) + (R11 -> R12) + (R12 -> R11) + (R13 -> R14) + (R14 -> R13) + (R15 -> R16) + (R16 -> R15) + (R17 -> R18) + (R18 -> R17) + (R19 -> R20) + (R20 -> R19) + (R21 -> R22) + (R22 -> R21) + (R23 -> R24) + (R24 -> R23) + (R25 -> R26) + (R26 -> R25) + (R27 -> R28) + (R28 -> R27) + (R29 -> R30) + (R30 -> R29) + (R31 -> R32) + (R32 -> R31) + (R33 -> R34) + (R34 -> R33) + (R35 -> R36) + (R36 -> R35) + (R37 -> R38) + (R38 -> R37) + (R39 -> R40) + (R40 -> R39) 
	givenTranslation = (R23 -> R23) + (R4 -> R4) + (R16 -> R16) + (R39 -> R39) + (R6 -> R6) + (R32 -> R32) + (R25 -> R25) + (R18 -> R18) + (R11 -> R11) + (R34 -> R34) + (R19 -> R19) + (R12 -> R12) + (R35 -> R35) + (R28 -> R28) + (R8 -> R8) + (R21 -> R21) + (R2 -> R2) + (R14 -> R14) + (R37 -> R37) + (R30 -> R30) + (R15 -> R15) + (R38 -> R38) + (R31 -> R31) + (R5 -> R5) + (R24 -> R24) + (R40 -> R40) + (R17 -> R17) + (R10 -> R10) + (R33 -> R33) + (R26 -> R26) + (R27 -> R27) + (R20 -> R20) + (R9 -> R9) + (R13 -> R13) + (R36 -> R36) + (R7 -> R7) + (R29 -> R29) + (R3 -> R3) + (R22 -> R22) + (R1 -> R1)
	givenRE = (R1 -> R2) + (R2 -> R1) + (R3 -> R4) + (R4 -> R3) + (R5 -> R6) + (R6 -> R5) + (R7 -> R8) + (R8 -> R7) + (R9 -> R10) + (R10 -> R9) + (R11 -> R12) + (R12 -> R11) + (R13 -> R14) + (R14 -> R13) + (R15 -> R16) + (R16 -> R15) + (R17 -> R18) + (R18 -> R17) + (R19 -> R20) + (R20 -> R19) + (R21 -> R22) + (R22 -> R21) + (R23 -> R24) + (R24 -> R23) + (R25 -> R26) + (R26 -> R25) + (R27 -> R28) + (R28 -> R27) + (R29 -> R30) + (R30 -> R29) + (R31 -> R32) + (R32 -> R31) + (R33 -> R34) + (R34 -> R33) + (R35 -> R36) + (R36 -> R35) + (R37 -> R38) + (R38 -> R37) + (R39 -> R40) + (R40 -> R39) 
	givenE =  none -> none
}

assert max_rules_easy_one_inc_Assertion____R1____R2 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R1, R2]
}
check max_rules_easy_one_inc_Assertion____R1____R2 for 1

assert max_rules_easy_one_inc_Assertion____R3____R4 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R3, R4]
}
check max_rules_easy_one_inc_Assertion____R3____R4 for 1

assert max_rules_easy_one_inc_Assertion____R5____R6 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R5, R6]
}
check max_rules_easy_one_inc_Assertion____R5____R6 for 1

assert max_rules_easy_one_inc_Assertion____R7____R8 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R7, R8]
}
check max_rules_easy_one_inc_Assertion____R7____R8 for 1

assert max_rules_easy_one_inc_Assertion____R9____R10 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R9, R10]
}
check max_rules_easy_one_inc_Assertion____R9____R10 for 1

assert max_rules_easy_one_inc_Assertion____R11____R12 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R11, R12]
}
check max_rules_easy_one_inc_Assertion____R11____R12 for 1

assert max_rules_easy_one_inc_Assertion____R13____R14 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R13, R14]
}
check max_rules_easy_one_inc_Assertion____R13____R14 for 1

assert max_rules_easy_one_inc_Assertion____R15____R16 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R15, R16]
}
check max_rules_easy_one_inc_Assertion____R15____R16 for 1

assert max_rules_easy_one_inc_Assertion____R17____R18 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R17, R18]
}
check max_rules_easy_one_inc_Assertion____R17____R18 for 1

assert max_rules_easy_one_inc_Assertion____R19____R20 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R19, R20]
}
check max_rules_easy_one_inc_Assertion____R19____R20 for 1

assert max_rules_easy_one_inc_Assertion____R21____R22 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R21, R22]
}
check max_rules_easy_one_inc_Assertion____R21____R22 for 1

assert max_rules_easy_one_inc_Assertion____R23____R24 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R23, R24]
}
check max_rules_easy_one_inc_Assertion____R23____R24 for 1

assert max_rules_easy_one_inc_Assertion____R25____R26 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R25, R26]
}
check max_rules_easy_one_inc_Assertion____R25____R26 for 1

assert max_rules_easy_one_inc_Assertion____R27____R28 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R27, R28]
}
check max_rules_easy_one_inc_Assertion____R27____R28 for 1

assert max_rules_easy_one_inc_Assertion____R29____R30 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R29, R30]
}
check max_rules_easy_one_inc_Assertion____R29____R30 for 1

assert max_rules_easy_one_inc_Assertion____R31____R32 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R31, R32]
}
check max_rules_easy_one_inc_Assertion____R31____R32 for 1

assert max_rules_easy_one_inc_Assertion____R33____R34 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R33, R34]
}
check max_rules_easy_one_inc_Assertion____R33____R34 for 1

assert max_rules_easy_one_inc_Assertion____R35____R36 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R35, R36]
}
check max_rules_easy_one_inc_Assertion____R35____R36 for 1

assert max_rules_easy_one_inc_Assertion____R37____R38 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R37, R38]
}
check max_rules_easy_one_inc_Assertion____R37____R38 for 1

assert max_rules_easy_one_inc_Assertion____R39____R40 {
	Consistency_r[max_rules_easy_one_inc, PersonPhone, PersonPhone, R39, R40]
}
check max_rules_easy_one_inc_Assertion____R39____R40 for 1


