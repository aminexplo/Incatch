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

one sig max_rules_hard_some_inc extends Scenario {
} {
	artifacts = PersonPhone
	rules = R40 + R21 + R20 + R23 + R22 + R25 + R24 + R27 + R26 + R29 + R28 + R1 + R2 + R3 + R4 + R5 + R6 + R7 + R8 + R9 + R30 + R10 + R32 + R31 + R12 + R34 + R11 + R33 + R14 + R36 + R13 + R35 + R16 + R38 + R15 + R37 + R18 + R17 + R39 + R19
	givenRM = (R1 -> R2) + (R2 -> R1) + (R3 -> R6) + (R3 -> R4) + (R3 -> R40) + (R3 -> R30) + (R3 -> R20) + (R3 -> R8) + (R3 -> R10) + (R3 -> R32) + (R3 -> R22) + (R3 -> R12) + (R3 -> R34) + (R3 -> R24) + (R3 -> R14) + (R3 -> R36) + (R3 -> R26) + (R3 -> R16) + (R3 -> R38) + (R3 -> R28) + (R3 -> R18) + (R4 -> R5) + (R4 -> R3) + (R4 -> R9) + (R4 -> R7) + (R4 -> R11) + (R4 -> R33) + (R4 -> R21) + (R4 -> R31) + (R4 -> R15) + (R4 -> R37) + (R4 -> R25) + (R4 -> R13) + (R4 -> R35) + (R4 -> R23) + (R4 -> R19) + (R4 -> R29) + (R4 -> R17) + (R4 -> R39) + (R4 -> R27) + (R5 -> R4) + (R5 -> R6) + (R5 -> R8) + (R5 -> R18) + (R5 -> R28) + (R5 -> R16) + (R5 -> R38) + (R5 -> R26) + (R5 -> R14) + (R5 -> R36) + (R5 -> R24) + (R5 -> R12) + (R5 -> R34) + (R5 -> R22) + (R5 -> R10) + (R5 -> R32) + (R5 -> R20) + (R5 -> R30) + (R5 -> R40) + (R6 -> R3) + (R6 -> R5) + (R6 -> R7) + (R6 -> R9) + (R6 -> R27) + (R6 -> R17) + (R6 -> R39) + (R6 -> R25) + (R6 -> R15) + (R6 -> R37) + (R6 -> R29) + (R6 -> R19) + (R6 -> R31) + (R6 -> R23) + (R6 -> R13) + (R6 -> R35) + (R6 -> R21) + (R6 -> R11) + (R6 -> R33) + (R7 -> R28) + (R7 -> R18) + (R7 -> R26) + (R7 -> R16) + (R7 -> R38) + (R7 -> R8) + (R7 -> R24) + (R7 -> R6) + (R7 -> R14) + (R7 -> R36) + (R7 -> R22) + (R7 -> R4) + (R7 -> R12) + (R7 -> R34) + (R7 -> R20) + (R7 -> R10) + (R7 -> R32) + (R7 -> R40) + (R7 -> R30) + (R8 -> R29) + (R8 -> R19) + (R8 -> R27) + (R8 -> R17) + (R8 -> R39) + (R8 -> R7) + (R8 -> R9) + (R8 -> R5) + (R8 -> R21) + (R8 -> R11) + (R8 -> R33) + (R8 -> R3) + (R8 -> R31) + (R8 -> R25) + (R8 -> R15) + (R8 -> R37) + (R8 -> R23) + (R8 -> R13) + (R8 -> R35) + (R9 -> R14) + (R9 -> R36) + (R9 -> R24) + (R9 -> R16) + (R9 -> R38) + (R9 -> R26) + (R9 -> R10) + (R9 -> R32) + (R9 -> R20) + (R9 -> R12) + (R9 -> R34) + (R9 -> R22) + (R9 -> R30) + (R9 -> R40) + (R9 -> R6) + (R9 -> R8) + (R9 -> R4) + (R9 -> R18) + (R9 -> R28) + (R10 -> R21) + (R10 -> R31) + (R10 -> R3) + (R10 -> R5) + (R10 -> R27) + (R10 -> R15) + (R10 -> R37) + (R10 -> R7) + (R10 -> R29) + (R10 -> R17) + (R10 -> R39) + (R10 -> R9) + (R10 -> R23) + (R10 -> R11) + (R10 -> R33) + (R10 -> R25) + (R10 -> R13) + (R10 -> R35) + (R10 -> R19) + (R11 -> R40) + (R11 -> R20) + (R11 -> R30) + (R11 -> R22) + (R11 -> R10) + (R11 -> R32) + (R11 -> R24) + (R11 -> R4) + (R11 -> R12) + (R11 -> R34) + (R11 -> R26) + (R11 -> R6) + (R11 -> R14) + (R11 -> R36) + (R11 -> R28) + (R11 -> R8) + (R11 -> R16) + (R11 -> R38) + (R11 -> R18) + (R12 -> R29) + (R12 -> R9) + (R12 -> R17) + (R12 -> R39) + (R12 -> R7) + (R12 -> R19) + (R12 -> R25) + (R12 -> R5) + (R12 -> R13) + (R12 -> R35) + (R12 -> R27) + (R12 -> R3) + (R12 -> R15) + (R12 -> R37) + (R12 -> R21) + (R12 -> R31) + (R12 -> R23) + (R12 -> R11) + (R12 -> R33) + (R13 -> R6) + (R13 -> R14) + (R13 -> R36) + (R13 -> R26) + (R13 -> R8) + (R13 -> R16) + (R13 -> R38) + (R13 -> R28) + (R13 -> R18) + (R13 -> R4) + (R13 -> R40) + (R13 -> R30) + (R13 -> R20) + (R13 -> R10) + (R13 -> R32) + (R13 -> R22) + (R13 -> R12) + (R13 -> R34) + (R13 -> R24) + (R14 -> R19) + (R14 -> R15) + (R14 -> R37) + (R14 -> R9) + (R14 -> R27) + (R14 -> R17) + (R14 -> R39) + (R14 -> R29) + (R14 -> R5) + (R14 -> R7) + (R14 -> R3) + (R14 -> R11) + (R14 -> R33) + (R14 -> R23) + (R14 -> R13) + (R14 -> R35) + (R14 -> R25) + (R14 -> R31) + (R14 -> R21) + (R15 -> R26) + (R15 -> R14) + (R15 -> R36) + (R15 -> R8) + (R15 -> R24) + (R15 -> R12) + (R15 -> R34) + (R15 -> R22) + (R15 -> R10) + (R15 -> R32) + (R15 -> R20) + (R15 -> R30) + (R15 -> R40) + (R15 -> R6) + (R15 -> R4) + (R15 -> R18) + (R15 -> R28) + (R15 -> R16) + (R15 -> R38) + (R16 -> R23) + (R16 -> R9) + (R16 -> R11) + (R16 -> R33) + (R16 -> R21) + (R16 -> R7) + (R16 -> R31) + (R16 -> R27) + (R16 -> R15) + (R16 -> R37) + (R16 -> R25) + (R16 -> R13) + (R16 -> R35) + (R16 -> R5) + (R16 -> R3) + (R16 -> R19) + (R16 -> R29) + (R16 -> R17) + (R16 -> R39) + (R17 -> R30) + (R17 -> R6) + (R17 -> R20) + (R17 -> R8) + (R17 -> R40) + (R17 -> R16) + (R17 -> R38) + (R17 -> R28) + (R17 -> R14) + (R17 -> R36) + (R17 -> R26) + (R17 -> R12) + (R17 -> R34) + (R17 -> R24) + (R17 -> R10) + (R17 -> R32) + (R17 -> R4) + (R17 -> R22) + (R17 -> R18) + (R18 -> R3) + (R18 -> R31) + (R18 -> R21) + (R18 -> R13) + (R18 -> R35) + (R18 -> R25) + (R18 -> R9) + (R18 -> R11) + (R18 -> R33) + (R18 -> R23) + (R18 -> R7) + (R18 -> R17) + (R18 -> R39) + (R18 -> R29) + (R18 -> R5) + (R18 -> R15) + (R18 -> R37) + (R18 -> R27) + (R18 -> R19) + (R19 -> R8) + (R19 -> R6) + (R19 -> R4) + (R19 -> R18) + (R19 -> R16) + (R19 -> R38) + (R19 -> R28) + (R19 -> R14) + (R19 -> R36) + (R19 -> R26) + (R19 -> R12) + (R19 -> R34) + (R19 -> R24) + (R19 -> R10) + (R19 -> R32) + (R19 -> R22) + (R19 -> R30) + (R19 -> R20) + (R19 -> R40) + (R20 -> R29) + (R20 -> R19) + (R20 -> R9) + (R20 -> R25) + (R20 -> R15) + (R20 -> R37) + (R20 -> R27) + (R20 -> R17) + (R20 -> R39) + (R20 -> R5) + (R20 -> R21) + (R20 -> R11) + (R20 -> R33) + (R20 -> R7) + (R20 -> R23) + (R20 -> R13) + (R20 -> R35) + (R20 -> R3) + (R20 -> R31) + (R21 -> R22) + (R21 -> R6) + (R21 -> R12) + (R21 -> R34) + (R21 -> R24) + (R21 -> R4) + (R21 -> R14) + (R21 -> R36) + (R21 -> R26) + (R21 -> R16) + (R21 -> R38) + (R21 -> R28) + (R21 -> R8) + (R21 -> R18) + (R21 -> R40) + (R21 -> R30) + (R21 -> R20) + (R21 -> R10) + (R21 -> R32) + (R22 -> R15) + (R22 -> R37) + (R22 -> R25) + (R22 -> R13) + (R22 -> R35) + (R22 -> R23) + (R22 -> R19) + (R22 -> R29) + (R22 -> R17) + (R22 -> R39) + (R22 -> R27) + (R22 -> R5) + (R22 -> R3) + (R22 -> R9) + (R22 -> R7) + (R22 -> R11) + (R22 -> R33) + (R22 -> R21) + (R22 -> R31) + (R23 -> R12) + (R23 -> R34) + (R23 -> R22) + (R23 -> R10) + (R23 -> R32) + (R23 -> R20) + (R23 -> R30) + (R23 -> R40) + (R23 -> R4) + (R23 -> R6) + (R23 -> R8) + (R23 -> R18) + (R23 -> R28) + (R23 -> R16) + (R23 -> R38) + (R23 -> R26) + (R23 -> R14) + (R23 -> R36) + (R23 -> R24) + (R24 -> R9) + (R24 -> R31) + (R24 -> R23) + (R24 -> R13) + (R24 -> R35) + (R24 -> R21) + (R24 -> R11) + (R24 -> R33) + (R24 -> R3) + (R24 -> R5) + (R24 -> R7) + (R24 -> R27) + (R24 -> R17) + (R24 -> R39) + (R24 -> R25) + (R24 -> R15) + (R24 -> R37) + (R24 -> R29) + (R24 -> R19) + (R25 -> R6) + (R25 -> R4) + (R25 -> R24) + (R25 -> R14) + (R25 -> R36) + (R25 -> R22) + (R25 -> R12) + (R25 -> R34) + (R25 -> R20) + (R25 -> R10) + (R25 -> R32) + (R25 -> R8) + (R25 -> R40) + (R25 -> R30) + (R25 -> R28) + (R25 -> R18) + (R25 -> R26) + (R25 -> R16) + (R25 -> R38) + (R26 -> R3) + (R26 -> R5) + (R26 -> R31) + (R26 -> R11) + (R26 -> R33) + (R26 -> R21) + (R26 -> R13) + (R26 -> R35) + (R26 -> R7) + (R26 -> R23) + (R26 -> R15) + (R26 -> R37) + (R26 -> R9) + (R26 -> R25) + (R26 -> R17) + (R26 -> R39) + (R26 -> R27) + (R26 -> R19) + (R26 -> R29) + (R27 -> R4) + (R27 -> R6) + (R27 -> R18) + (R27 -> R28) + (R27 -> R8) + (R27 -> R14) + (R27 -> R36) + (R27 -> R24) + (R27 -> R16) + (R27 -> R38) + (R27 -> R26) + (R27 -> R10) + (R27 -> R32) + (R27 -> R20) + (R27 -> R12) + (R27 -> R34) + (R27 -> R22) + (R27 -> R30) + (R27 -> R40) + (R28 -> R3) + (R28 -> R19) + (R28 -> R7) + (R28 -> R29) + (R28 -> R5) + (R28 -> R9) + (R28 -> R11) + (R28 -> R33) + (R28 -> R21) + (R28 -> R13) + (R28 -> R35) + (R28 -> R23) + (R28 -> R15) + (R28 -> R37) + (R28 -> R25) + (R28 -> R17) + (R28 -> R39) + (R28 -> R27) + (R28 -> R31) + (R29 -> R6) + (R29 -> R4) + (R29 -> R8) + (R29 -> R40) + (R29 -> R30) + (R29 -> R20) + (R29 -> R10) + (R29 -> R32) + (R29 -> R26) + (R29 -> R16) + (R29 -> R38) + (R29 -> R28) + (R29 -> R18) + (R29 -> R22) + (R29 -> R12) + (R29 -> R34) + (R29 -> R24) + (R29 -> R14) + (R29 -> R36) + (R30 -> R23) + (R30 -> R11) + (R30 -> R33) + (R30 -> R21) + (R30 -> R31) + (R30 -> R27) + (R30 -> R15) + (R30 -> R37) + (R30 -> R25) + (R30 -> R13) + (R30 -> R35) + (R30 -> R7) + (R30 -> R19) + (R30 -> R29) + (R30 -> R9) + (R30 -> R17) + (R30 -> R39) + (R30 -> R3) + (R30 -> R5) + (R31 -> R30) + (R31 -> R20) + (R31 -> R40) + (R31 -> R8) + (R31 -> R6) + (R31 -> R18) + (R31 -> R4) + (R31 -> R16) + (R31 -> R38) + (R31 -> R28) + (R31 -> R14) + (R31 -> R36) + (R31 -> R26) + (R31 -> R12) + (R31 -> R34) + (R31 -> R24) + (R31 -> R10) + (R31 -> R32) + (R31 -> R22) + (R32 -> R9) + (R32 -> R31) + (R32 -> R7) + (R32 -> R21) + (R32 -> R5) + (R32 -> R19) + (R32 -> R13) + (R32 -> R35) + (R32 -> R3) + (R32 -> R25) + (R32 -> R11) + (R32 -> R33) + (R32 -> R23) + (R32 -> R17) + (R32 -> R39) + (R32 -> R29) + (R32 -> R15) + (R32 -> R37) + (R32 -> R27) + (R33 -> R8) + (R33 -> R4) + (R33 -> R6) + (R33 -> R20) + (R33 -> R30) + (R33 -> R22) + (R33 -> R10) + (R33 -> R32) + (R33 -> R40) + (R33 -> R28) + (R33 -> R16) + (R33 -> R38) + (R33 -> R18) + (R33 -> R24) + (R33 -> R12) + (R33 -> R34) + (R33 -> R26) + (R33 -> R14) + (R33 -> R36) + (R34 -> R5) + (R34 -> R3) + (R34 -> R9) + (R34 -> R7) + (R34 -> R21) + (R34 -> R31) + (R34 -> R23) + (R34 -> R11) + (R34 -> R33) + (R34 -> R25) + (R34 -> R13) + (R34 -> R35) + (R34 -> R27) + (R34 -> R15) + (R34 -> R37) + (R34 -> R29) + (R34 -> R17) + (R34 -> R39) + (R34 -> R19) + (R35 -> R4) + (R35 -> R8) + (R35 -> R6) + (R35 -> R18) + (R35 -> R14) + (R35 -> R36) + (R35 -> R26) + (R35 -> R16) + (R35 -> R38) + (R35 -> R28) + (R35 -> R10) + (R35 -> R32) + (R35 -> R22) + (R35 -> R12) + (R35 -> R34) + (R35 -> R24) + (R35 -> R40) + (R35 -> R30) + (R35 -> R20) + (R36 -> R3) + (R36 -> R5) + (R36 -> R7) + (R36 -> R9) + (R36 -> R15) + (R36 -> R37) + (R36 -> R27) + (R36 -> R17) + (R36 -> R39) + (R36 -> R29) + (R36 -> R19) + (R36 -> R31) + (R36 -> R21) + (R36 -> R11) + (R36 -> R33) + (R36 -> R23) + (R36 -> R13) + (R36 -> R35) + (R36 -> R25) + (R37 -> R16) + (R37 -> R38) + (R37 -> R4) + (R37 -> R28) + (R37 -> R18) + (R37 -> R6) + (R37 -> R8) + (R37 -> R40) + (R37 -> R12) + (R37 -> R34) + (R37 -> R24) + (R37 -> R14) + (R37 -> R36) + (R37 -> R26) + (R37 -> R30) + (R37 -> R20) + (R37 -> R10) + (R37 -> R32) + (R37 -> R22) + (R38 -> R27) + (R38 -> R15) + (R38 -> R37) + (R38 -> R25) + (R38 -> R13) + (R38 -> R35) + (R38 -> R23) + (R38 -> R11) + (R38 -> R33) + (R38 -> R21) + (R38 -> R31) + (R38 -> R9) + (R38 -> R7) + (R38 -> R5) + (R38 -> R3) + (R38 -> R19) + (R38 -> R29) + (R38 -> R17) + (R38 -> R39) + (R39 -> R24) + (R39 -> R12) + (R39 -> R34) + (R39 -> R22) + (R39 -> R10) + (R39 -> R32) + (R39 -> R28) + (R39 -> R16) + (R39 -> R38) + (R39 -> R26) + (R39 -> R14) + (R39 -> R36) + (R39 -> R20) + (R39 -> R30) + (R39 -> R40) + (R39 -> R6) + (R39 -> R8) + (R39 -> R4) + (R39 -> R18) + (R40 -> R9) + (R40 -> R7) + (R40 -> R17) + (R40 -> R39) + (R40 -> R27) + (R40 -> R19) + (R40 -> R29) + (R40 -> R31) + (R40 -> R11) + (R40 -> R33) + (R40 -> R21) + (R40 -> R13) + (R40 -> R35) + (R40 -> R5) + (R40 -> R23) + (R40 -> R15) + (R40 -> R37) + (R40 -> R3) + (R40 -> R25) 
	givenTranslation = (R23 -> R23) + (R4 -> R4) + (R16 -> R16) + (R39 -> R39) + (R6 -> R6) + (R32 -> R32) + (R25 -> R25) + (R18 -> R18) + (R11 -> R11) + (R34 -> R34) + (R19 -> R19) + (R12 -> R12) + (R35 -> R35) + (R28 -> R28) + (R8 -> R8) + (R21 -> R21) + (R2 -> R2) + (R14 -> R14) + (R37 -> R37) + (R30 -> R30) + (R15 -> R15) + (R38 -> R38) + (R31 -> R31) + (R5 -> R5) + (R24 -> R24) + (R40 -> R40) + (R17 -> R17) + (R10 -> R10) + (R33 -> R33) + (R26 -> R26) + (R27 -> R27) + (R20 -> R20) + (R9 -> R9) + (R13 -> R13) + (R36 -> R36) + (R7 -> R7) + (R29 -> R29) + (R3 -> R3) + (R22 -> R22) + (R1 -> R1)
	givenRE = (R1 -> R2) + (R2 -> R1) + (R3 -> R6) + (R3 -> R4) + (R3 -> R40) + (R3 -> R30) + (R3 -> R20) + (R3 -> R8) + (R3 -> R10) + (R3 -> R32) + (R3 -> R22) + (R3 -> R12) + (R3 -> R34) + (R3 -> R24) + (R3 -> R14) + (R3 -> R36) + (R3 -> R26) + (R3 -> R16) + (R3 -> R38) + (R3 -> R28) + (R3 -> R18) + (R4 -> R5) + (R4 -> R3) + (R4 -> R9) + (R4 -> R7) + (R4 -> R11) + (R4 -> R33) + (R4 -> R21) + (R4 -> R31) + (R4 -> R15) + (R4 -> R37) + (R4 -> R25) + (R4 -> R13) + (R4 -> R35) + (R4 -> R23) + (R4 -> R19) + (R4 -> R29) + (R4 -> R17) + (R4 -> R39) + (R4 -> R27) + (R5 -> R4) + (R5 -> R6) + (R5 -> R8) + (R5 -> R18) + (R5 -> R28) + (R5 -> R16) + (R5 -> R38) + (R5 -> R26) + (R5 -> R14) + (R5 -> R36) + (R5 -> R24) + (R5 -> R12) + (R5 -> R34) + (R5 -> R22) + (R5 -> R10) + (R5 -> R32) + (R5 -> R20) + (R5 -> R30) + (R5 -> R40) + (R6 -> R3) + (R6 -> R5) + (R6 -> R7) + (R6 -> R9) + (R6 -> R27) + (R6 -> R17) + (R6 -> R39) + (R6 -> R25) + (R6 -> R15) + (R6 -> R37) + (R6 -> R29) + (R6 -> R19) + (R6 -> R31) + (R6 -> R23) + (R6 -> R13) + (R6 -> R35) + (R6 -> R21) + (R6 -> R11) + (R6 -> R33) + (R7 -> R28) + (R7 -> R18) + (R7 -> R26) + (R7 -> R16) + (R7 -> R38) + (R7 -> R8) + (R7 -> R24) + (R7 -> R6) + (R7 -> R14) + (R7 -> R36) + (R7 -> R22) + (R7 -> R4) + (R7 -> R12) + (R7 -> R34) + (R7 -> R20) + (R7 -> R10) + (R7 -> R32) + (R7 -> R40) + (R7 -> R30) + (R8 -> R29) + (R8 -> R19) + (R8 -> R27) + (R8 -> R17) + (R8 -> R39) + (R8 -> R7) + (R8 -> R9) + (R8 -> R5) + (R8 -> R21) + (R8 -> R11) + (R8 -> R33) + (R8 -> R3) + (R8 -> R31) + (R8 -> R25) + (R8 -> R15) + (R8 -> R37) + (R8 -> R23) + (R8 -> R13) + (R8 -> R35) + (R9 -> R14) + (R9 -> R36) + (R9 -> R24) + (R9 -> R16) + (R9 -> R38) + (R9 -> R26) + (R9 -> R10) + (R9 -> R32) + (R9 -> R20) + (R9 -> R12) + (R9 -> R34) + (R9 -> R22) + (R9 -> R30) + (R9 -> R40) + (R9 -> R6) + (R9 -> R8) + (R9 -> R4) + (R9 -> R18) + (R9 -> R28) + (R10 -> R21) + (R10 -> R31) + (R10 -> R3) + (R10 -> R5) + (R10 -> R27) + (R10 -> R15) + (R10 -> R37) + (R10 -> R7) + (R10 -> R29) + (R10 -> R17) + (R10 -> R39) + (R10 -> R9) + (R10 -> R23) + (R10 -> R11) + (R10 -> R33) + (R10 -> R25) + (R10 -> R13) + (R10 -> R35) + (R10 -> R19) + (R11 -> R40) + (R11 -> R20) + (R11 -> R30) + (R11 -> R22) + (R11 -> R10) + (R11 -> R32) + (R11 -> R24) + (R11 -> R4) + (R11 -> R12) + (R11 -> R34) + (R11 -> R26) + (R11 -> R6) + (R11 -> R14) + (R11 -> R36) + (R11 -> R28) + (R11 -> R8) + (R11 -> R16) + (R11 -> R38) + (R11 -> R18) + (R12 -> R29) + (R12 -> R9) + (R12 -> R17) + (R12 -> R39) + (R12 -> R7) + (R12 -> R19) + (R12 -> R25) + (R12 -> R5) + (R12 -> R13) + (R12 -> R35) + (R12 -> R27) + (R12 -> R3) + (R12 -> R15) + (R12 -> R37) + (R12 -> R21) + (R12 -> R31) + (R12 -> R23) + (R12 -> R11) + (R12 -> R33) + (R13 -> R6) + (R13 -> R14) + (R13 -> R36) + (R13 -> R26) + (R13 -> R8) + (R13 -> R16) + (R13 -> R38) + (R13 -> R28) + (R13 -> R18) + (R13 -> R4) + (R13 -> R40) + (R13 -> R30) + (R13 -> R20) + (R13 -> R10) + (R13 -> R32) + (R13 -> R22) + (R13 -> R12) + (R13 -> R34) + (R13 -> R24) + (R14 -> R19) + (R14 -> R15) + (R14 -> R37) + (R14 -> R9) + (R14 -> R27) + (R14 -> R17) + (R14 -> R39) + (R14 -> R29) + (R14 -> R5) + (R14 -> R7) + (R14 -> R3) + (R14 -> R11) + (R14 -> R33) + (R14 -> R23) + (R14 -> R13) + (R14 -> R35) + (R14 -> R25) + (R14 -> R31) + (R14 -> R21) + (R15 -> R26) + (R15 -> R14) + (R15 -> R36) + (R15 -> R8) + (R15 -> R24) + (R15 -> R12) + (R15 -> R34) + (R15 -> R22) + (R15 -> R10) + (R15 -> R32) + (R15 -> R20) + (R15 -> R30) + (R15 -> R40) + (R15 -> R6) + (R15 -> R4) + (R15 -> R18) + (R15 -> R28) + (R15 -> R16) + (R15 -> R38) + (R16 -> R23) + (R16 -> R9) + (R16 -> R11) + (R16 -> R33) + (R16 -> R21) + (R16 -> R7) + (R16 -> R31) + (R16 -> R27) + (R16 -> R15) + (R16 -> R37) + (R16 -> R25) + (R16 -> R13) + (R16 -> R35) + (R16 -> R5) + (R16 -> R3) + (R16 -> R19) + (R16 -> R29) + (R16 -> R17) + (R16 -> R39) + (R17 -> R30) + (R17 -> R6) + (R17 -> R20) + (R17 -> R8) + (R17 -> R40) + (R17 -> R16) + (R17 -> R38) + (R17 -> R28) + (R17 -> R14) + (R17 -> R36) + (R17 -> R26) + (R17 -> R12) + (R17 -> R34) + (R17 -> R24) + (R17 -> R10) + (R17 -> R32) + (R17 -> R4) + (R17 -> R22) + (R17 -> R18) + (R18 -> R3) + (R18 -> R31) + (R18 -> R21) + (R18 -> R13) + (R18 -> R35) + (R18 -> R25) + (R18 -> R9) + (R18 -> R11) + (R18 -> R33) + (R18 -> R23) + (R18 -> R7) + (R18 -> R17) + (R18 -> R39) + (R18 -> R29) + (R18 -> R5) + (R18 -> R15) + (R18 -> R37) + (R18 -> R27) + (R18 -> R19) + (R19 -> R8) + (R19 -> R6) + (R19 -> R4) + (R19 -> R18) + (R19 -> R16) + (R19 -> R38) + (R19 -> R28) + (R19 -> R14) + (R19 -> R36) + (R19 -> R26) + (R19 -> R12) + (R19 -> R34) + (R19 -> R24) + (R19 -> R10) + (R19 -> R32) + (R19 -> R22) + (R19 -> R30) + (R19 -> R20) + (R19 -> R40) + (R20 -> R29) + (R20 -> R19) + (R20 -> R9) + (R20 -> R25) + (R20 -> R15) + (R20 -> R37) + (R20 -> R27) + (R20 -> R17) + (R20 -> R39) + (R20 -> R5) + (R20 -> R21) + (R20 -> R11) + (R20 -> R33) + (R20 -> R7) + (R20 -> R23) + (R20 -> R13) + (R20 -> R35) + (R20 -> R3) + (R20 -> R31) + (R21 -> R22) + (R21 -> R6) + (R21 -> R12) + (R21 -> R34) + (R21 -> R24) + (R21 -> R4) + (R21 -> R14) + (R21 -> R36) + (R21 -> R26) + (R21 -> R16) + (R21 -> R38) + (R21 -> R28) + (R21 -> R8) + (R21 -> R18) + (R21 -> R40) + (R21 -> R30) + (R21 -> R20) + (R21 -> R10) + (R21 -> R32) + (R22 -> R15) + (R22 -> R37) + (R22 -> R25) + (R22 -> R13) + (R22 -> R35) + (R22 -> R23) + (R22 -> R19) + (R22 -> R29) + (R22 -> R17) + (R22 -> R39) + (R22 -> R27) + (R22 -> R5) + (R22 -> R3) + (R22 -> R9) + (R22 -> R7) + (R22 -> R11) + (R22 -> R33) + (R22 -> R21) + (R22 -> R31) + (R23 -> R12) + (R23 -> R34) + (R23 -> R22) + (R23 -> R10) + (R23 -> R32) + (R23 -> R20) + (R23 -> R30) + (R23 -> R40) + (R23 -> R4) + (R23 -> R6) + (R23 -> R8) + (R23 -> R18) + (R23 -> R28) + (R23 -> R16) + (R23 -> R38) + (R23 -> R26) + (R23 -> R14) + (R23 -> R36) + (R23 -> R24) + (R24 -> R9) + (R24 -> R31) + (R24 -> R23) + (R24 -> R13) + (R24 -> R35) + (R24 -> R21) + (R24 -> R11) + (R24 -> R33) + (R24 -> R3) + (R24 -> R5) + (R24 -> R7) + (R24 -> R27) + (R24 -> R17) + (R24 -> R39) + (R24 -> R25) + (R24 -> R15) + (R24 -> R37) + (R24 -> R29) + (R24 -> R19) + (R25 -> R6) + (R25 -> R4) + (R25 -> R24) + (R25 -> R14) + (R25 -> R36) + (R25 -> R22) + (R25 -> R12) + (R25 -> R34) + (R25 -> R20) + (R25 -> R10) + (R25 -> R32) + (R25 -> R8) + (R25 -> R40) + (R25 -> R30) + (R25 -> R28) + (R25 -> R18) + (R25 -> R26) + (R25 -> R16) + (R25 -> R38) + (R26 -> R3) + (R26 -> R5) + (R26 -> R31) + (R26 -> R11) + (R26 -> R33) + (R26 -> R21) + (R26 -> R13) + (R26 -> R35) + (R26 -> R7) + (R26 -> R23) + (R26 -> R15) + (R26 -> R37) + (R26 -> R9) + (R26 -> R25) + (R26 -> R17) + (R26 -> R39) + (R26 -> R27) + (R26 -> R19) + (R26 -> R29) + (R27 -> R4) + (R27 -> R6) + (R27 -> R18) + (R27 -> R28) + (R27 -> R8) + (R27 -> R14) + (R27 -> R36) + (R27 -> R24) + (R27 -> R16) + (R27 -> R38) + (R27 -> R26) + (R27 -> R10) + (R27 -> R32) + (R27 -> R20) + (R27 -> R12) + (R27 -> R34) + (R27 -> R22) + (R27 -> R30) + (R27 -> R40) + (R28 -> R3) + (R28 -> R19) + (R28 -> R7) + (R28 -> R29) + (R28 -> R5) + (R28 -> R9) + (R28 -> R11) + (R28 -> R33) + (R28 -> R21) + (R28 -> R13) + (R28 -> R35) + (R28 -> R23) + (R28 -> R15) + (R28 -> R37) + (R28 -> R25) + (R28 -> R17) + (R28 -> R39) + (R28 -> R27) + (R28 -> R31) + (R29 -> R6) + (R29 -> R4) + (R29 -> R8) + (R29 -> R40) + (R29 -> R30) + (R29 -> R20) + (R29 -> R10) + (R29 -> R32) + (R29 -> R26) + (R29 -> R16) + (R29 -> R38) + (R29 -> R28) + (R29 -> R18) + (R29 -> R22) + (R29 -> R12) + (R29 -> R34) + (R29 -> R24) + (R29 -> R14) + (R29 -> R36) + (R30 -> R23) + (R30 -> R11) + (R30 -> R33) + (R30 -> R21) + (R30 -> R31) + (R30 -> R27) + (R30 -> R15) + (R30 -> R37) + (R30 -> R25) + (R30 -> R13) + (R30 -> R35) + (R30 -> R7) + (R30 -> R19) + (R30 -> R29) + (R30 -> R9) + (R30 -> R17) + (R30 -> R39) + (R30 -> R3) + (R30 -> R5) + (R31 -> R30) + (R31 -> R20) + (R31 -> R40) + (R31 -> R8) + (R31 -> R6) + (R31 -> R18) + (R31 -> R4) + (R31 -> R16) + (R31 -> R38) + (R31 -> R28) + (R31 -> R14) + (R31 -> R36) + (R31 -> R26) + (R31 -> R12) + (R31 -> R34) + (R31 -> R24) + (R31 -> R10) + (R31 -> R32) + (R31 -> R22) + (R32 -> R9) + (R32 -> R31) + (R32 -> R7) + (R32 -> R21) + (R32 -> R5) + (R32 -> R19) + (R32 -> R13) + (R32 -> R35) + (R32 -> R3) + (R32 -> R25) + (R32 -> R11) + (R32 -> R33) + (R32 -> R23) + (R32 -> R17) + (R32 -> R39) + (R32 -> R29) + (R32 -> R15) + (R32 -> R37) + (R32 -> R27) + (R33 -> R8) + (R33 -> R4) + (R33 -> R6) + (R33 -> R20) + (R33 -> R30) + (R33 -> R22) + (R33 -> R10) + (R33 -> R32) + (R33 -> R40) + (R33 -> R28) + (R33 -> R16) + (R33 -> R38) + (R33 -> R18) + (R33 -> R24) + (R33 -> R12) + (R33 -> R34) + (R33 -> R26) + (R33 -> R14) + (R33 -> R36) + (R34 -> R5) + (R34 -> R3) + (R34 -> R9) + (R34 -> R7) + (R34 -> R21) + (R34 -> R31) + (R34 -> R23) + (R34 -> R11) + (R34 -> R33) + (R34 -> R25) + (R34 -> R13) + (R34 -> R35) + (R34 -> R27) + (R34 -> R15) + (R34 -> R37) + (R34 -> R29) + (R34 -> R17) + (R34 -> R39) + (R34 -> R19) + (R35 -> R4) + (R35 -> R8) + (R35 -> R6) + (R35 -> R18) + (R35 -> R14) + (R35 -> R36) + (R35 -> R26) + (R35 -> R16) + (R35 -> R38) + (R35 -> R28) + (R35 -> R10) + (R35 -> R32) + (R35 -> R22) + (R35 -> R12) + (R35 -> R34) + (R35 -> R24) + (R35 -> R40) + (R35 -> R30) + (R35 -> R20) + (R36 -> R3) + (R36 -> R5) + (R36 -> R7) + (R36 -> R9) + (R36 -> R15) + (R36 -> R37) + (R36 -> R27) + (R36 -> R17) + (R36 -> R39) + (R36 -> R29) + (R36 -> R19) + (R36 -> R31) + (R36 -> R21) + (R36 -> R11) + (R36 -> R33) + (R36 -> R23) + (R36 -> R13) + (R36 -> R35) + (R36 -> R25) + (R37 -> R16) + (R37 -> R38) + (R37 -> R4) + (R37 -> R28) + (R37 -> R18) + (R37 -> R6) + (R37 -> R8) + (R37 -> R40) + (R37 -> R12) + (R37 -> R34) + (R37 -> R24) + (R37 -> R14) + (R37 -> R36) + (R37 -> R26) + (R37 -> R30) + (R37 -> R20) + (R37 -> R10) + (R37 -> R32) + (R37 -> R22) + (R38 -> R27) + (R38 -> R15) + (R38 -> R37) + (R38 -> R25) + (R38 -> R13) + (R38 -> R35) + (R38 -> R23) + (R38 -> R11) + (R38 -> R33) + (R38 -> R21) + (R38 -> R31) + (R38 -> R9) + (R38 -> R7) + (R38 -> R5) + (R38 -> R3) + (R38 -> R19) + (R38 -> R29) + (R38 -> R17) + (R38 -> R39) + (R39 -> R24) + (R39 -> R12) + (R39 -> R34) + (R39 -> R22) + (R39 -> R10) + (R39 -> R32) + (R39 -> R28) + (R39 -> R16) + (R39 -> R38) + (R39 -> R26) + (R39 -> R14) + (R39 -> R36) + (R39 -> R20) + (R39 -> R30) + (R39 -> R40) + (R39 -> R6) + (R39 -> R8) + (R39 -> R4) + (R39 -> R18) + (R40 -> R9) + (R40 -> R7) + (R40 -> R17) + (R40 -> R39) + (R40 -> R27) + (R40 -> R19) + (R40 -> R29) + (R40 -> R31) + (R40 -> R11) + (R40 -> R33) + (R40 -> R21) + (R40 -> R13) + (R40 -> R35) + (R40 -> R5) + (R40 -> R23) + (R40 -> R15) + (R40 -> R37) + (R40 -> R3) + (R40 -> R25) 
	givenE =  none -> none
}

assert max_rules_hard_some_inc_Assertion____R1____R2 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R1, R2]
}
check max_rules_hard_some_inc_Assertion____R1____R2 for 1

assert max_rules_hard_some_inc_Assertion____R3____R4 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R4]
}
check max_rules_hard_some_inc_Assertion____R3____R4 for 1

assert max_rules_hard_some_inc_Assertion____R3____R6 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R6]
}
check max_rules_hard_some_inc_Assertion____R3____R6 for 1

assert max_rules_hard_some_inc_Assertion____R3____R8 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R8]
}
check max_rules_hard_some_inc_Assertion____R3____R8 for 1

assert max_rules_hard_some_inc_Assertion____R3____R10 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R10]
}
check max_rules_hard_some_inc_Assertion____R3____R10 for 1

assert max_rules_hard_some_inc_Assertion____R3____R12 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R12]
}
check max_rules_hard_some_inc_Assertion____R3____R12 for 1

assert max_rules_hard_some_inc_Assertion____R3____R14 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R14]
}
check max_rules_hard_some_inc_Assertion____R3____R14 for 1

assert max_rules_hard_some_inc_Assertion____R3____R16 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R16]
}
check max_rules_hard_some_inc_Assertion____R3____R16 for 1

assert max_rules_hard_some_inc_Assertion____R3____R18 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R18]
}
check max_rules_hard_some_inc_Assertion____R3____R18 for 1

assert max_rules_hard_some_inc_Assertion____R3____R20 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R20]
}
check max_rules_hard_some_inc_Assertion____R3____R20 for 1

assert max_rules_hard_some_inc_Assertion____R3____R22 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R22]
}
check max_rules_hard_some_inc_Assertion____R3____R22 for 1

assert max_rules_hard_some_inc_Assertion____R3____R24 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R24]
}
check max_rules_hard_some_inc_Assertion____R3____R24 for 1

assert max_rules_hard_some_inc_Assertion____R3____R26 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R26]
}
check max_rules_hard_some_inc_Assertion____R3____R26 for 1

assert max_rules_hard_some_inc_Assertion____R3____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R28]
}
check max_rules_hard_some_inc_Assertion____R3____R28 for 1

assert max_rules_hard_some_inc_Assertion____R3____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R30]
}
check max_rules_hard_some_inc_Assertion____R3____R30 for 1

assert max_rules_hard_some_inc_Assertion____R3____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R32]
}
check max_rules_hard_some_inc_Assertion____R3____R32 for 1

assert max_rules_hard_some_inc_Assertion____R3____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R34]
}
check max_rules_hard_some_inc_Assertion____R3____R34 for 1

assert max_rules_hard_some_inc_Assertion____R3____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R36]
}
check max_rules_hard_some_inc_Assertion____R3____R36 for 1

assert max_rules_hard_some_inc_Assertion____R3____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R38]
}
check max_rules_hard_some_inc_Assertion____R3____R38 for 1

assert max_rules_hard_some_inc_Assertion____R3____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R3, R40]
}
check max_rules_hard_some_inc_Assertion____R3____R40 for 1

assert max_rules_hard_some_inc_Assertion____R4____R5 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R5]
}
check max_rules_hard_some_inc_Assertion____R4____R5 for 1

assert max_rules_hard_some_inc_Assertion____R4____R7 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R7]
}
check max_rules_hard_some_inc_Assertion____R4____R7 for 1

assert max_rules_hard_some_inc_Assertion____R4____R9 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R9]
}
check max_rules_hard_some_inc_Assertion____R4____R9 for 1

assert max_rules_hard_some_inc_Assertion____R4____R11 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R11]
}
check max_rules_hard_some_inc_Assertion____R4____R11 for 1

assert max_rules_hard_some_inc_Assertion____R4____R13 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R13]
}
check max_rules_hard_some_inc_Assertion____R4____R13 for 1

assert max_rules_hard_some_inc_Assertion____R4____R15 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R15]
}
check max_rules_hard_some_inc_Assertion____R4____R15 for 1

assert max_rules_hard_some_inc_Assertion____R4____R17 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R17]
}
check max_rules_hard_some_inc_Assertion____R4____R17 for 1

assert max_rules_hard_some_inc_Assertion____R4____R19 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R19]
}
check max_rules_hard_some_inc_Assertion____R4____R19 for 1

assert max_rules_hard_some_inc_Assertion____R4____R21 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R21]
}
check max_rules_hard_some_inc_Assertion____R4____R21 for 1

assert max_rules_hard_some_inc_Assertion____R4____R23 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R23]
}
check max_rules_hard_some_inc_Assertion____R4____R23 for 1

assert max_rules_hard_some_inc_Assertion____R4____R25 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R25]
}
check max_rules_hard_some_inc_Assertion____R4____R25 for 1

assert max_rules_hard_some_inc_Assertion____R4____R27 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R27]
}
check max_rules_hard_some_inc_Assertion____R4____R27 for 1

assert max_rules_hard_some_inc_Assertion____R4____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R29]
}
check max_rules_hard_some_inc_Assertion____R4____R29 for 1

assert max_rules_hard_some_inc_Assertion____R4____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R31]
}
check max_rules_hard_some_inc_Assertion____R4____R31 for 1

assert max_rules_hard_some_inc_Assertion____R4____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R33]
}
check max_rules_hard_some_inc_Assertion____R4____R33 for 1

assert max_rules_hard_some_inc_Assertion____R4____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R35]
}
check max_rules_hard_some_inc_Assertion____R4____R35 for 1

assert max_rules_hard_some_inc_Assertion____R4____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R37]
}
check max_rules_hard_some_inc_Assertion____R4____R37 for 1

assert max_rules_hard_some_inc_Assertion____R4____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R4, R39]
}
check max_rules_hard_some_inc_Assertion____R4____R39 for 1

assert max_rules_hard_some_inc_Assertion____R5____R6 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R6]
}
check max_rules_hard_some_inc_Assertion____R5____R6 for 1

assert max_rules_hard_some_inc_Assertion____R5____R8 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R8]
}
check max_rules_hard_some_inc_Assertion____R5____R8 for 1

assert max_rules_hard_some_inc_Assertion____R5____R10 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R10]
}
check max_rules_hard_some_inc_Assertion____R5____R10 for 1

assert max_rules_hard_some_inc_Assertion____R5____R12 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R12]
}
check max_rules_hard_some_inc_Assertion____R5____R12 for 1

assert max_rules_hard_some_inc_Assertion____R5____R14 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R14]
}
check max_rules_hard_some_inc_Assertion____R5____R14 for 1

assert max_rules_hard_some_inc_Assertion____R5____R16 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R16]
}
check max_rules_hard_some_inc_Assertion____R5____R16 for 1

assert max_rules_hard_some_inc_Assertion____R5____R18 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R18]
}
check max_rules_hard_some_inc_Assertion____R5____R18 for 1

assert max_rules_hard_some_inc_Assertion____R5____R20 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R20]
}
check max_rules_hard_some_inc_Assertion____R5____R20 for 1

assert max_rules_hard_some_inc_Assertion____R5____R22 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R22]
}
check max_rules_hard_some_inc_Assertion____R5____R22 for 1

assert max_rules_hard_some_inc_Assertion____R5____R24 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R24]
}
check max_rules_hard_some_inc_Assertion____R5____R24 for 1

assert max_rules_hard_some_inc_Assertion____R5____R26 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R26]
}
check max_rules_hard_some_inc_Assertion____R5____R26 for 1

assert max_rules_hard_some_inc_Assertion____R5____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R28]
}
check max_rules_hard_some_inc_Assertion____R5____R28 for 1

assert max_rules_hard_some_inc_Assertion____R5____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R30]
}
check max_rules_hard_some_inc_Assertion____R5____R30 for 1

assert max_rules_hard_some_inc_Assertion____R5____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R32]
}
check max_rules_hard_some_inc_Assertion____R5____R32 for 1

assert max_rules_hard_some_inc_Assertion____R5____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R34]
}
check max_rules_hard_some_inc_Assertion____R5____R34 for 1

assert max_rules_hard_some_inc_Assertion____R5____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R36]
}
check max_rules_hard_some_inc_Assertion____R5____R36 for 1

assert max_rules_hard_some_inc_Assertion____R5____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R38]
}
check max_rules_hard_some_inc_Assertion____R5____R38 for 1

assert max_rules_hard_some_inc_Assertion____R5____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R5, R40]
}
check max_rules_hard_some_inc_Assertion____R5____R40 for 1

assert max_rules_hard_some_inc_Assertion____R6____R7 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R7]
}
check max_rules_hard_some_inc_Assertion____R6____R7 for 1

assert max_rules_hard_some_inc_Assertion____R6____R9 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R9]
}
check max_rules_hard_some_inc_Assertion____R6____R9 for 1

assert max_rules_hard_some_inc_Assertion____R6____R11 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R11]
}
check max_rules_hard_some_inc_Assertion____R6____R11 for 1

assert max_rules_hard_some_inc_Assertion____R6____R13 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R13]
}
check max_rules_hard_some_inc_Assertion____R6____R13 for 1

assert max_rules_hard_some_inc_Assertion____R6____R15 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R15]
}
check max_rules_hard_some_inc_Assertion____R6____R15 for 1

assert max_rules_hard_some_inc_Assertion____R6____R17 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R17]
}
check max_rules_hard_some_inc_Assertion____R6____R17 for 1

assert max_rules_hard_some_inc_Assertion____R6____R19 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R19]
}
check max_rules_hard_some_inc_Assertion____R6____R19 for 1

assert max_rules_hard_some_inc_Assertion____R6____R21 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R21]
}
check max_rules_hard_some_inc_Assertion____R6____R21 for 1

assert max_rules_hard_some_inc_Assertion____R6____R23 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R23]
}
check max_rules_hard_some_inc_Assertion____R6____R23 for 1

assert max_rules_hard_some_inc_Assertion____R6____R25 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R25]
}
check max_rules_hard_some_inc_Assertion____R6____R25 for 1

assert max_rules_hard_some_inc_Assertion____R6____R27 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R27]
}
check max_rules_hard_some_inc_Assertion____R6____R27 for 1

assert max_rules_hard_some_inc_Assertion____R6____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R29]
}
check max_rules_hard_some_inc_Assertion____R6____R29 for 1

assert max_rules_hard_some_inc_Assertion____R6____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R31]
}
check max_rules_hard_some_inc_Assertion____R6____R31 for 1

assert max_rules_hard_some_inc_Assertion____R6____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R33]
}
check max_rules_hard_some_inc_Assertion____R6____R33 for 1

assert max_rules_hard_some_inc_Assertion____R6____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R35]
}
check max_rules_hard_some_inc_Assertion____R6____R35 for 1

assert max_rules_hard_some_inc_Assertion____R6____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R37]
}
check max_rules_hard_some_inc_Assertion____R6____R37 for 1

assert max_rules_hard_some_inc_Assertion____R6____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R6, R39]
}
check max_rules_hard_some_inc_Assertion____R6____R39 for 1

assert max_rules_hard_some_inc_Assertion____R7____R8 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R8]
}
check max_rules_hard_some_inc_Assertion____R7____R8 for 1

assert max_rules_hard_some_inc_Assertion____R7____R10 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R10]
}
check max_rules_hard_some_inc_Assertion____R7____R10 for 1

assert max_rules_hard_some_inc_Assertion____R7____R12 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R12]
}
check max_rules_hard_some_inc_Assertion____R7____R12 for 1

assert max_rules_hard_some_inc_Assertion____R7____R14 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R14]
}
check max_rules_hard_some_inc_Assertion____R7____R14 for 1

assert max_rules_hard_some_inc_Assertion____R7____R16 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R16]
}
check max_rules_hard_some_inc_Assertion____R7____R16 for 1

assert max_rules_hard_some_inc_Assertion____R7____R18 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R18]
}
check max_rules_hard_some_inc_Assertion____R7____R18 for 1

assert max_rules_hard_some_inc_Assertion____R7____R20 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R20]
}
check max_rules_hard_some_inc_Assertion____R7____R20 for 1

assert max_rules_hard_some_inc_Assertion____R7____R22 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R22]
}
check max_rules_hard_some_inc_Assertion____R7____R22 for 1

assert max_rules_hard_some_inc_Assertion____R7____R24 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R24]
}
check max_rules_hard_some_inc_Assertion____R7____R24 for 1

assert max_rules_hard_some_inc_Assertion____R7____R26 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R26]
}
check max_rules_hard_some_inc_Assertion____R7____R26 for 1

assert max_rules_hard_some_inc_Assertion____R7____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R28]
}
check max_rules_hard_some_inc_Assertion____R7____R28 for 1

assert max_rules_hard_some_inc_Assertion____R7____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R30]
}
check max_rules_hard_some_inc_Assertion____R7____R30 for 1

assert max_rules_hard_some_inc_Assertion____R7____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R32]
}
check max_rules_hard_some_inc_Assertion____R7____R32 for 1

assert max_rules_hard_some_inc_Assertion____R7____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R34]
}
check max_rules_hard_some_inc_Assertion____R7____R34 for 1

assert max_rules_hard_some_inc_Assertion____R7____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R36]
}
check max_rules_hard_some_inc_Assertion____R7____R36 for 1

assert max_rules_hard_some_inc_Assertion____R7____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R38]
}
check max_rules_hard_some_inc_Assertion____R7____R38 for 1

assert max_rules_hard_some_inc_Assertion____R7____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R7, R40]
}
check max_rules_hard_some_inc_Assertion____R7____R40 for 1

assert max_rules_hard_some_inc_Assertion____R8____R9 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R9]
}
check max_rules_hard_some_inc_Assertion____R8____R9 for 1

assert max_rules_hard_some_inc_Assertion____R8____R11 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R11]
}
check max_rules_hard_some_inc_Assertion____R8____R11 for 1

assert max_rules_hard_some_inc_Assertion____R8____R13 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R13]
}
check max_rules_hard_some_inc_Assertion____R8____R13 for 1

assert max_rules_hard_some_inc_Assertion____R8____R15 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R15]
}
check max_rules_hard_some_inc_Assertion____R8____R15 for 1

assert max_rules_hard_some_inc_Assertion____R8____R17 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R17]
}
check max_rules_hard_some_inc_Assertion____R8____R17 for 1

assert max_rules_hard_some_inc_Assertion____R8____R19 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R19]
}
check max_rules_hard_some_inc_Assertion____R8____R19 for 1

assert max_rules_hard_some_inc_Assertion____R8____R21 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R21]
}
check max_rules_hard_some_inc_Assertion____R8____R21 for 1

assert max_rules_hard_some_inc_Assertion____R8____R23 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R23]
}
check max_rules_hard_some_inc_Assertion____R8____R23 for 1

assert max_rules_hard_some_inc_Assertion____R8____R25 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R25]
}
check max_rules_hard_some_inc_Assertion____R8____R25 for 1

assert max_rules_hard_some_inc_Assertion____R8____R27 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R27]
}
check max_rules_hard_some_inc_Assertion____R8____R27 for 1

assert max_rules_hard_some_inc_Assertion____R8____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R29]
}
check max_rules_hard_some_inc_Assertion____R8____R29 for 1

assert max_rules_hard_some_inc_Assertion____R8____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R31]
}
check max_rules_hard_some_inc_Assertion____R8____R31 for 1

assert max_rules_hard_some_inc_Assertion____R8____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R33]
}
check max_rules_hard_some_inc_Assertion____R8____R33 for 1

assert max_rules_hard_some_inc_Assertion____R8____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R35]
}
check max_rules_hard_some_inc_Assertion____R8____R35 for 1

assert max_rules_hard_some_inc_Assertion____R8____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R37]
}
check max_rules_hard_some_inc_Assertion____R8____R37 for 1

assert max_rules_hard_some_inc_Assertion____R8____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R8, R39]
}
check max_rules_hard_some_inc_Assertion____R8____R39 for 1

assert max_rules_hard_some_inc_Assertion____R9____R10 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R10]
}
check max_rules_hard_some_inc_Assertion____R9____R10 for 1

assert max_rules_hard_some_inc_Assertion____R9____R12 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R12]
}
check max_rules_hard_some_inc_Assertion____R9____R12 for 1

assert max_rules_hard_some_inc_Assertion____R9____R14 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R14]
}
check max_rules_hard_some_inc_Assertion____R9____R14 for 1

assert max_rules_hard_some_inc_Assertion____R9____R16 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R16]
}
check max_rules_hard_some_inc_Assertion____R9____R16 for 1

assert max_rules_hard_some_inc_Assertion____R9____R18 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R18]
}
check max_rules_hard_some_inc_Assertion____R9____R18 for 1

assert max_rules_hard_some_inc_Assertion____R9____R20 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R20]
}
check max_rules_hard_some_inc_Assertion____R9____R20 for 1

assert max_rules_hard_some_inc_Assertion____R9____R22 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R22]
}
check max_rules_hard_some_inc_Assertion____R9____R22 for 1

assert max_rules_hard_some_inc_Assertion____R9____R24 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R24]
}
check max_rules_hard_some_inc_Assertion____R9____R24 for 1

assert max_rules_hard_some_inc_Assertion____R9____R26 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R26]
}
check max_rules_hard_some_inc_Assertion____R9____R26 for 1

assert max_rules_hard_some_inc_Assertion____R9____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R28]
}
check max_rules_hard_some_inc_Assertion____R9____R28 for 1

assert max_rules_hard_some_inc_Assertion____R9____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R30]
}
check max_rules_hard_some_inc_Assertion____R9____R30 for 1

assert max_rules_hard_some_inc_Assertion____R9____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R32]
}
check max_rules_hard_some_inc_Assertion____R9____R32 for 1

assert max_rules_hard_some_inc_Assertion____R9____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R34]
}
check max_rules_hard_some_inc_Assertion____R9____R34 for 1

assert max_rules_hard_some_inc_Assertion____R9____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R36]
}
check max_rules_hard_some_inc_Assertion____R9____R36 for 1

assert max_rules_hard_some_inc_Assertion____R9____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R38]
}
check max_rules_hard_some_inc_Assertion____R9____R38 for 1

assert max_rules_hard_some_inc_Assertion____R9____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R9, R40]
}
check max_rules_hard_some_inc_Assertion____R9____R40 for 1

assert max_rules_hard_some_inc_Assertion____R10____R11 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R11]
}
check max_rules_hard_some_inc_Assertion____R10____R11 for 1

assert max_rules_hard_some_inc_Assertion____R10____R13 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R13]
}
check max_rules_hard_some_inc_Assertion____R10____R13 for 1

assert max_rules_hard_some_inc_Assertion____R10____R15 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R15]
}
check max_rules_hard_some_inc_Assertion____R10____R15 for 1

assert max_rules_hard_some_inc_Assertion____R10____R17 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R17]
}
check max_rules_hard_some_inc_Assertion____R10____R17 for 1

assert max_rules_hard_some_inc_Assertion____R10____R19 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R19]
}
check max_rules_hard_some_inc_Assertion____R10____R19 for 1

assert max_rules_hard_some_inc_Assertion____R10____R21 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R21]
}
check max_rules_hard_some_inc_Assertion____R10____R21 for 1

assert max_rules_hard_some_inc_Assertion____R10____R23 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R23]
}
check max_rules_hard_some_inc_Assertion____R10____R23 for 1

assert max_rules_hard_some_inc_Assertion____R10____R25 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R25]
}
check max_rules_hard_some_inc_Assertion____R10____R25 for 1

assert max_rules_hard_some_inc_Assertion____R10____R27 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R27]
}
check max_rules_hard_some_inc_Assertion____R10____R27 for 1

assert max_rules_hard_some_inc_Assertion____R10____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R29]
}
check max_rules_hard_some_inc_Assertion____R10____R29 for 1

assert max_rules_hard_some_inc_Assertion____R10____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R31]
}
check max_rules_hard_some_inc_Assertion____R10____R31 for 1

assert max_rules_hard_some_inc_Assertion____R10____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R33]
}
check max_rules_hard_some_inc_Assertion____R10____R33 for 1

assert max_rules_hard_some_inc_Assertion____R10____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R35]
}
check max_rules_hard_some_inc_Assertion____R10____R35 for 1

assert max_rules_hard_some_inc_Assertion____R10____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R37]
}
check max_rules_hard_some_inc_Assertion____R10____R37 for 1

assert max_rules_hard_some_inc_Assertion____R10____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R10, R39]
}
check max_rules_hard_some_inc_Assertion____R10____R39 for 1

assert max_rules_hard_some_inc_Assertion____R11____R12 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R12]
}
check max_rules_hard_some_inc_Assertion____R11____R12 for 1

assert max_rules_hard_some_inc_Assertion____R11____R14 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R14]
}
check max_rules_hard_some_inc_Assertion____R11____R14 for 1

assert max_rules_hard_some_inc_Assertion____R11____R16 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R16]
}
check max_rules_hard_some_inc_Assertion____R11____R16 for 1

assert max_rules_hard_some_inc_Assertion____R11____R18 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R18]
}
check max_rules_hard_some_inc_Assertion____R11____R18 for 1

assert max_rules_hard_some_inc_Assertion____R11____R20 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R20]
}
check max_rules_hard_some_inc_Assertion____R11____R20 for 1

assert max_rules_hard_some_inc_Assertion____R11____R22 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R22]
}
check max_rules_hard_some_inc_Assertion____R11____R22 for 1

assert max_rules_hard_some_inc_Assertion____R11____R24 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R24]
}
check max_rules_hard_some_inc_Assertion____R11____R24 for 1

assert max_rules_hard_some_inc_Assertion____R11____R26 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R26]
}
check max_rules_hard_some_inc_Assertion____R11____R26 for 1

assert max_rules_hard_some_inc_Assertion____R11____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R28]
}
check max_rules_hard_some_inc_Assertion____R11____R28 for 1

assert max_rules_hard_some_inc_Assertion____R11____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R30]
}
check max_rules_hard_some_inc_Assertion____R11____R30 for 1

assert max_rules_hard_some_inc_Assertion____R11____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R32]
}
check max_rules_hard_some_inc_Assertion____R11____R32 for 1

assert max_rules_hard_some_inc_Assertion____R11____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R34]
}
check max_rules_hard_some_inc_Assertion____R11____R34 for 1

assert max_rules_hard_some_inc_Assertion____R11____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R36]
}
check max_rules_hard_some_inc_Assertion____R11____R36 for 1

assert max_rules_hard_some_inc_Assertion____R11____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R38]
}
check max_rules_hard_some_inc_Assertion____R11____R38 for 1

assert max_rules_hard_some_inc_Assertion____R11____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R11, R40]
}
check max_rules_hard_some_inc_Assertion____R11____R40 for 1

assert max_rules_hard_some_inc_Assertion____R12____R13 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R13]
}
check max_rules_hard_some_inc_Assertion____R12____R13 for 1

assert max_rules_hard_some_inc_Assertion____R12____R15 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R15]
}
check max_rules_hard_some_inc_Assertion____R12____R15 for 1

assert max_rules_hard_some_inc_Assertion____R12____R17 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R17]
}
check max_rules_hard_some_inc_Assertion____R12____R17 for 1

assert max_rules_hard_some_inc_Assertion____R12____R19 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R19]
}
check max_rules_hard_some_inc_Assertion____R12____R19 for 1

assert max_rules_hard_some_inc_Assertion____R12____R21 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R21]
}
check max_rules_hard_some_inc_Assertion____R12____R21 for 1

assert max_rules_hard_some_inc_Assertion____R12____R23 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R23]
}
check max_rules_hard_some_inc_Assertion____R12____R23 for 1

assert max_rules_hard_some_inc_Assertion____R12____R25 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R25]
}
check max_rules_hard_some_inc_Assertion____R12____R25 for 1

assert max_rules_hard_some_inc_Assertion____R12____R27 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R27]
}
check max_rules_hard_some_inc_Assertion____R12____R27 for 1

assert max_rules_hard_some_inc_Assertion____R12____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R29]
}
check max_rules_hard_some_inc_Assertion____R12____R29 for 1

assert max_rules_hard_some_inc_Assertion____R12____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R31]
}
check max_rules_hard_some_inc_Assertion____R12____R31 for 1

assert max_rules_hard_some_inc_Assertion____R12____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R33]
}
check max_rules_hard_some_inc_Assertion____R12____R33 for 1

assert max_rules_hard_some_inc_Assertion____R12____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R35]
}
check max_rules_hard_some_inc_Assertion____R12____R35 for 1

assert max_rules_hard_some_inc_Assertion____R12____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R37]
}
check max_rules_hard_some_inc_Assertion____R12____R37 for 1

assert max_rules_hard_some_inc_Assertion____R12____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R12, R39]
}
check max_rules_hard_some_inc_Assertion____R12____R39 for 1

assert max_rules_hard_some_inc_Assertion____R13____R14 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R14]
}
check max_rules_hard_some_inc_Assertion____R13____R14 for 1

assert max_rules_hard_some_inc_Assertion____R13____R16 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R16]
}
check max_rules_hard_some_inc_Assertion____R13____R16 for 1

assert max_rules_hard_some_inc_Assertion____R13____R18 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R18]
}
check max_rules_hard_some_inc_Assertion____R13____R18 for 1

assert max_rules_hard_some_inc_Assertion____R13____R20 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R20]
}
check max_rules_hard_some_inc_Assertion____R13____R20 for 1

assert max_rules_hard_some_inc_Assertion____R13____R22 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R22]
}
check max_rules_hard_some_inc_Assertion____R13____R22 for 1

assert max_rules_hard_some_inc_Assertion____R13____R24 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R24]
}
check max_rules_hard_some_inc_Assertion____R13____R24 for 1

assert max_rules_hard_some_inc_Assertion____R13____R26 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R26]
}
check max_rules_hard_some_inc_Assertion____R13____R26 for 1

assert max_rules_hard_some_inc_Assertion____R13____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R28]
}
check max_rules_hard_some_inc_Assertion____R13____R28 for 1

assert max_rules_hard_some_inc_Assertion____R13____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R30]
}
check max_rules_hard_some_inc_Assertion____R13____R30 for 1

assert max_rules_hard_some_inc_Assertion____R13____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R32]
}
check max_rules_hard_some_inc_Assertion____R13____R32 for 1

assert max_rules_hard_some_inc_Assertion____R13____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R34]
}
check max_rules_hard_some_inc_Assertion____R13____R34 for 1

assert max_rules_hard_some_inc_Assertion____R13____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R36]
}
check max_rules_hard_some_inc_Assertion____R13____R36 for 1

assert max_rules_hard_some_inc_Assertion____R13____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R38]
}
check max_rules_hard_some_inc_Assertion____R13____R38 for 1

assert max_rules_hard_some_inc_Assertion____R13____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R13, R40]
}
check max_rules_hard_some_inc_Assertion____R13____R40 for 1

assert max_rules_hard_some_inc_Assertion____R14____R15 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R15]
}
check max_rules_hard_some_inc_Assertion____R14____R15 for 1

assert max_rules_hard_some_inc_Assertion____R14____R17 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R17]
}
check max_rules_hard_some_inc_Assertion____R14____R17 for 1

assert max_rules_hard_some_inc_Assertion____R14____R19 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R19]
}
check max_rules_hard_some_inc_Assertion____R14____R19 for 1

assert max_rules_hard_some_inc_Assertion____R14____R21 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R21]
}
check max_rules_hard_some_inc_Assertion____R14____R21 for 1

assert max_rules_hard_some_inc_Assertion____R14____R23 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R23]
}
check max_rules_hard_some_inc_Assertion____R14____R23 for 1

assert max_rules_hard_some_inc_Assertion____R14____R25 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R25]
}
check max_rules_hard_some_inc_Assertion____R14____R25 for 1

assert max_rules_hard_some_inc_Assertion____R14____R27 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R27]
}
check max_rules_hard_some_inc_Assertion____R14____R27 for 1

assert max_rules_hard_some_inc_Assertion____R14____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R29]
}
check max_rules_hard_some_inc_Assertion____R14____R29 for 1

assert max_rules_hard_some_inc_Assertion____R14____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R31]
}
check max_rules_hard_some_inc_Assertion____R14____R31 for 1

assert max_rules_hard_some_inc_Assertion____R14____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R33]
}
check max_rules_hard_some_inc_Assertion____R14____R33 for 1

assert max_rules_hard_some_inc_Assertion____R14____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R35]
}
check max_rules_hard_some_inc_Assertion____R14____R35 for 1

assert max_rules_hard_some_inc_Assertion____R14____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R37]
}
check max_rules_hard_some_inc_Assertion____R14____R37 for 1

assert max_rules_hard_some_inc_Assertion____R14____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R14, R39]
}
check max_rules_hard_some_inc_Assertion____R14____R39 for 1

assert max_rules_hard_some_inc_Assertion____R15____R16 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R16]
}
check max_rules_hard_some_inc_Assertion____R15____R16 for 1

assert max_rules_hard_some_inc_Assertion____R15____R18 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R18]
}
check max_rules_hard_some_inc_Assertion____R15____R18 for 1

assert max_rules_hard_some_inc_Assertion____R15____R20 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R20]
}
check max_rules_hard_some_inc_Assertion____R15____R20 for 1

assert max_rules_hard_some_inc_Assertion____R15____R22 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R22]
}
check max_rules_hard_some_inc_Assertion____R15____R22 for 1

assert max_rules_hard_some_inc_Assertion____R15____R24 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R24]
}
check max_rules_hard_some_inc_Assertion____R15____R24 for 1

assert max_rules_hard_some_inc_Assertion____R15____R26 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R26]
}
check max_rules_hard_some_inc_Assertion____R15____R26 for 1

assert max_rules_hard_some_inc_Assertion____R15____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R28]
}
check max_rules_hard_some_inc_Assertion____R15____R28 for 1

assert max_rules_hard_some_inc_Assertion____R15____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R30]
}
check max_rules_hard_some_inc_Assertion____R15____R30 for 1

assert max_rules_hard_some_inc_Assertion____R15____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R32]
}
check max_rules_hard_some_inc_Assertion____R15____R32 for 1

assert max_rules_hard_some_inc_Assertion____R15____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R34]
}
check max_rules_hard_some_inc_Assertion____R15____R34 for 1

assert max_rules_hard_some_inc_Assertion____R15____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R36]
}
check max_rules_hard_some_inc_Assertion____R15____R36 for 1

assert max_rules_hard_some_inc_Assertion____R15____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R38]
}
check max_rules_hard_some_inc_Assertion____R15____R38 for 1

assert max_rules_hard_some_inc_Assertion____R15____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R15, R40]
}
check max_rules_hard_some_inc_Assertion____R15____R40 for 1

assert max_rules_hard_some_inc_Assertion____R16____R17 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R17]
}
check max_rules_hard_some_inc_Assertion____R16____R17 for 1

assert max_rules_hard_some_inc_Assertion____R16____R19 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R19]
}
check max_rules_hard_some_inc_Assertion____R16____R19 for 1

assert max_rules_hard_some_inc_Assertion____R16____R21 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R21]
}
check max_rules_hard_some_inc_Assertion____R16____R21 for 1

assert max_rules_hard_some_inc_Assertion____R16____R23 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R23]
}
check max_rules_hard_some_inc_Assertion____R16____R23 for 1

assert max_rules_hard_some_inc_Assertion____R16____R25 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R25]
}
check max_rules_hard_some_inc_Assertion____R16____R25 for 1

assert max_rules_hard_some_inc_Assertion____R16____R27 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R27]
}
check max_rules_hard_some_inc_Assertion____R16____R27 for 1

assert max_rules_hard_some_inc_Assertion____R16____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R29]
}
check max_rules_hard_some_inc_Assertion____R16____R29 for 1

assert max_rules_hard_some_inc_Assertion____R16____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R31]
}
check max_rules_hard_some_inc_Assertion____R16____R31 for 1

assert max_rules_hard_some_inc_Assertion____R16____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R33]
}
check max_rules_hard_some_inc_Assertion____R16____R33 for 1

assert max_rules_hard_some_inc_Assertion____R16____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R35]
}
check max_rules_hard_some_inc_Assertion____R16____R35 for 1

assert max_rules_hard_some_inc_Assertion____R16____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R37]
}
check max_rules_hard_some_inc_Assertion____R16____R37 for 1

assert max_rules_hard_some_inc_Assertion____R16____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R16, R39]
}
check max_rules_hard_some_inc_Assertion____R16____R39 for 1

assert max_rules_hard_some_inc_Assertion____R17____R18 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R18]
}
check max_rules_hard_some_inc_Assertion____R17____R18 for 1

assert max_rules_hard_some_inc_Assertion____R17____R20 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R20]
}
check max_rules_hard_some_inc_Assertion____R17____R20 for 1

assert max_rules_hard_some_inc_Assertion____R17____R22 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R22]
}
check max_rules_hard_some_inc_Assertion____R17____R22 for 1

assert max_rules_hard_some_inc_Assertion____R17____R24 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R24]
}
check max_rules_hard_some_inc_Assertion____R17____R24 for 1

assert max_rules_hard_some_inc_Assertion____R17____R26 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R26]
}
check max_rules_hard_some_inc_Assertion____R17____R26 for 1

assert max_rules_hard_some_inc_Assertion____R17____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R28]
}
check max_rules_hard_some_inc_Assertion____R17____R28 for 1

assert max_rules_hard_some_inc_Assertion____R17____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R30]
}
check max_rules_hard_some_inc_Assertion____R17____R30 for 1

assert max_rules_hard_some_inc_Assertion____R17____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R32]
}
check max_rules_hard_some_inc_Assertion____R17____R32 for 1

assert max_rules_hard_some_inc_Assertion____R17____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R34]
}
check max_rules_hard_some_inc_Assertion____R17____R34 for 1

assert max_rules_hard_some_inc_Assertion____R17____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R36]
}
check max_rules_hard_some_inc_Assertion____R17____R36 for 1

assert max_rules_hard_some_inc_Assertion____R17____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R38]
}
check max_rules_hard_some_inc_Assertion____R17____R38 for 1

assert max_rules_hard_some_inc_Assertion____R17____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R17, R40]
}
check max_rules_hard_some_inc_Assertion____R17____R40 for 1

assert max_rules_hard_some_inc_Assertion____R18____R19 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R18, R19]
}
check max_rules_hard_some_inc_Assertion____R18____R19 for 1

assert max_rules_hard_some_inc_Assertion____R18____R21 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R18, R21]
}
check max_rules_hard_some_inc_Assertion____R18____R21 for 1

assert max_rules_hard_some_inc_Assertion____R18____R23 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R18, R23]
}
check max_rules_hard_some_inc_Assertion____R18____R23 for 1

assert max_rules_hard_some_inc_Assertion____R18____R25 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R18, R25]
}
check max_rules_hard_some_inc_Assertion____R18____R25 for 1

assert max_rules_hard_some_inc_Assertion____R18____R27 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R18, R27]
}
check max_rules_hard_some_inc_Assertion____R18____R27 for 1

assert max_rules_hard_some_inc_Assertion____R18____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R18, R29]
}
check max_rules_hard_some_inc_Assertion____R18____R29 for 1

assert max_rules_hard_some_inc_Assertion____R18____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R18, R31]
}
check max_rules_hard_some_inc_Assertion____R18____R31 for 1

assert max_rules_hard_some_inc_Assertion____R18____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R18, R33]
}
check max_rules_hard_some_inc_Assertion____R18____R33 for 1

assert max_rules_hard_some_inc_Assertion____R18____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R18, R35]
}
check max_rules_hard_some_inc_Assertion____R18____R35 for 1

assert max_rules_hard_some_inc_Assertion____R18____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R18, R37]
}
check max_rules_hard_some_inc_Assertion____R18____R37 for 1

assert max_rules_hard_some_inc_Assertion____R18____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R18, R39]
}
check max_rules_hard_some_inc_Assertion____R18____R39 for 1

assert max_rules_hard_some_inc_Assertion____R19____R20 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R19, R20]
}
check max_rules_hard_some_inc_Assertion____R19____R20 for 1

assert max_rules_hard_some_inc_Assertion____R19____R22 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R19, R22]
}
check max_rules_hard_some_inc_Assertion____R19____R22 for 1

assert max_rules_hard_some_inc_Assertion____R19____R24 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R19, R24]
}
check max_rules_hard_some_inc_Assertion____R19____R24 for 1

assert max_rules_hard_some_inc_Assertion____R19____R26 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R19, R26]
}
check max_rules_hard_some_inc_Assertion____R19____R26 for 1

assert max_rules_hard_some_inc_Assertion____R19____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R19, R28]
}
check max_rules_hard_some_inc_Assertion____R19____R28 for 1

assert max_rules_hard_some_inc_Assertion____R19____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R19, R30]
}
check max_rules_hard_some_inc_Assertion____R19____R30 for 1

assert max_rules_hard_some_inc_Assertion____R19____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R19, R32]
}
check max_rules_hard_some_inc_Assertion____R19____R32 for 1

assert max_rules_hard_some_inc_Assertion____R19____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R19, R34]
}
check max_rules_hard_some_inc_Assertion____R19____R34 for 1

assert max_rules_hard_some_inc_Assertion____R19____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R19, R36]
}
check max_rules_hard_some_inc_Assertion____R19____R36 for 1

assert max_rules_hard_some_inc_Assertion____R19____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R19, R38]
}
check max_rules_hard_some_inc_Assertion____R19____R38 for 1

assert max_rules_hard_some_inc_Assertion____R19____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R19, R40]
}
check max_rules_hard_some_inc_Assertion____R19____R40 for 1

assert max_rules_hard_some_inc_Assertion____R20____R21 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R20, R21]
}
check max_rules_hard_some_inc_Assertion____R20____R21 for 1

assert max_rules_hard_some_inc_Assertion____R20____R23 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R20, R23]
}
check max_rules_hard_some_inc_Assertion____R20____R23 for 1

assert max_rules_hard_some_inc_Assertion____R20____R25 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R20, R25]
}
check max_rules_hard_some_inc_Assertion____R20____R25 for 1

assert max_rules_hard_some_inc_Assertion____R20____R27 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R20, R27]
}
check max_rules_hard_some_inc_Assertion____R20____R27 for 1

assert max_rules_hard_some_inc_Assertion____R20____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R20, R29]
}
check max_rules_hard_some_inc_Assertion____R20____R29 for 1

assert max_rules_hard_some_inc_Assertion____R20____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R20, R31]
}
check max_rules_hard_some_inc_Assertion____R20____R31 for 1

assert max_rules_hard_some_inc_Assertion____R20____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R20, R33]
}
check max_rules_hard_some_inc_Assertion____R20____R33 for 1

assert max_rules_hard_some_inc_Assertion____R20____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R20, R35]
}
check max_rules_hard_some_inc_Assertion____R20____R35 for 1

assert max_rules_hard_some_inc_Assertion____R20____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R20, R37]
}
check max_rules_hard_some_inc_Assertion____R20____R37 for 1

assert max_rules_hard_some_inc_Assertion____R20____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R20, R39]
}
check max_rules_hard_some_inc_Assertion____R20____R39 for 1

assert max_rules_hard_some_inc_Assertion____R21____R22 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R21, R22]
}
check max_rules_hard_some_inc_Assertion____R21____R22 for 1

assert max_rules_hard_some_inc_Assertion____R21____R24 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R21, R24]
}
check max_rules_hard_some_inc_Assertion____R21____R24 for 1

assert max_rules_hard_some_inc_Assertion____R21____R26 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R21, R26]
}
check max_rules_hard_some_inc_Assertion____R21____R26 for 1

assert max_rules_hard_some_inc_Assertion____R21____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R21, R28]
}
check max_rules_hard_some_inc_Assertion____R21____R28 for 1

assert max_rules_hard_some_inc_Assertion____R21____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R21, R30]
}
check max_rules_hard_some_inc_Assertion____R21____R30 for 1

assert max_rules_hard_some_inc_Assertion____R21____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R21, R32]
}
check max_rules_hard_some_inc_Assertion____R21____R32 for 1

assert max_rules_hard_some_inc_Assertion____R21____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R21, R34]
}
check max_rules_hard_some_inc_Assertion____R21____R34 for 1

assert max_rules_hard_some_inc_Assertion____R21____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R21, R36]
}
check max_rules_hard_some_inc_Assertion____R21____R36 for 1

assert max_rules_hard_some_inc_Assertion____R21____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R21, R38]
}
check max_rules_hard_some_inc_Assertion____R21____R38 for 1

assert max_rules_hard_some_inc_Assertion____R21____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R21, R40]
}
check max_rules_hard_some_inc_Assertion____R21____R40 for 1

assert max_rules_hard_some_inc_Assertion____R22____R23 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R22, R23]
}
check max_rules_hard_some_inc_Assertion____R22____R23 for 1

assert max_rules_hard_some_inc_Assertion____R22____R25 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R22, R25]
}
check max_rules_hard_some_inc_Assertion____R22____R25 for 1

assert max_rules_hard_some_inc_Assertion____R22____R27 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R22, R27]
}
check max_rules_hard_some_inc_Assertion____R22____R27 for 1

assert max_rules_hard_some_inc_Assertion____R22____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R22, R29]
}
check max_rules_hard_some_inc_Assertion____R22____R29 for 1

assert max_rules_hard_some_inc_Assertion____R22____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R22, R31]
}
check max_rules_hard_some_inc_Assertion____R22____R31 for 1

assert max_rules_hard_some_inc_Assertion____R22____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R22, R33]
}
check max_rules_hard_some_inc_Assertion____R22____R33 for 1

assert max_rules_hard_some_inc_Assertion____R22____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R22, R35]
}
check max_rules_hard_some_inc_Assertion____R22____R35 for 1

assert max_rules_hard_some_inc_Assertion____R22____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R22, R37]
}
check max_rules_hard_some_inc_Assertion____R22____R37 for 1

assert max_rules_hard_some_inc_Assertion____R22____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R22, R39]
}
check max_rules_hard_some_inc_Assertion____R22____R39 for 1

assert max_rules_hard_some_inc_Assertion____R23____R24 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R23, R24]
}
check max_rules_hard_some_inc_Assertion____R23____R24 for 1

assert max_rules_hard_some_inc_Assertion____R23____R26 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R23, R26]
}
check max_rules_hard_some_inc_Assertion____R23____R26 for 1

assert max_rules_hard_some_inc_Assertion____R23____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R23, R28]
}
check max_rules_hard_some_inc_Assertion____R23____R28 for 1

assert max_rules_hard_some_inc_Assertion____R23____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R23, R30]
}
check max_rules_hard_some_inc_Assertion____R23____R30 for 1

assert max_rules_hard_some_inc_Assertion____R23____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R23, R32]
}
check max_rules_hard_some_inc_Assertion____R23____R32 for 1

assert max_rules_hard_some_inc_Assertion____R23____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R23, R34]
}
check max_rules_hard_some_inc_Assertion____R23____R34 for 1

assert max_rules_hard_some_inc_Assertion____R23____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R23, R36]
}
check max_rules_hard_some_inc_Assertion____R23____R36 for 1

assert max_rules_hard_some_inc_Assertion____R23____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R23, R38]
}
check max_rules_hard_some_inc_Assertion____R23____R38 for 1

assert max_rules_hard_some_inc_Assertion____R23____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R23, R40]
}
check max_rules_hard_some_inc_Assertion____R23____R40 for 1

assert max_rules_hard_some_inc_Assertion____R24____R25 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R24, R25]
}
check max_rules_hard_some_inc_Assertion____R24____R25 for 1

assert max_rules_hard_some_inc_Assertion____R24____R27 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R24, R27]
}
check max_rules_hard_some_inc_Assertion____R24____R27 for 1

assert max_rules_hard_some_inc_Assertion____R24____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R24, R29]
}
check max_rules_hard_some_inc_Assertion____R24____R29 for 1

assert max_rules_hard_some_inc_Assertion____R24____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R24, R31]
}
check max_rules_hard_some_inc_Assertion____R24____R31 for 1

assert max_rules_hard_some_inc_Assertion____R24____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R24, R33]
}
check max_rules_hard_some_inc_Assertion____R24____R33 for 1

assert max_rules_hard_some_inc_Assertion____R24____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R24, R35]
}
check max_rules_hard_some_inc_Assertion____R24____R35 for 1

assert max_rules_hard_some_inc_Assertion____R24____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R24, R37]
}
check max_rules_hard_some_inc_Assertion____R24____R37 for 1

assert max_rules_hard_some_inc_Assertion____R24____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R24, R39]
}
check max_rules_hard_some_inc_Assertion____R24____R39 for 1

assert max_rules_hard_some_inc_Assertion____R25____R26 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R25, R26]
}
check max_rules_hard_some_inc_Assertion____R25____R26 for 1

assert max_rules_hard_some_inc_Assertion____R25____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R25, R28]
}
check max_rules_hard_some_inc_Assertion____R25____R28 for 1

assert max_rules_hard_some_inc_Assertion____R25____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R25, R30]
}
check max_rules_hard_some_inc_Assertion____R25____R30 for 1

assert max_rules_hard_some_inc_Assertion____R25____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R25, R32]
}
check max_rules_hard_some_inc_Assertion____R25____R32 for 1

assert max_rules_hard_some_inc_Assertion____R25____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R25, R34]
}
check max_rules_hard_some_inc_Assertion____R25____R34 for 1

assert max_rules_hard_some_inc_Assertion____R25____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R25, R36]
}
check max_rules_hard_some_inc_Assertion____R25____R36 for 1

assert max_rules_hard_some_inc_Assertion____R25____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R25, R38]
}
check max_rules_hard_some_inc_Assertion____R25____R38 for 1

assert max_rules_hard_some_inc_Assertion____R25____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R25, R40]
}
check max_rules_hard_some_inc_Assertion____R25____R40 for 1

assert max_rules_hard_some_inc_Assertion____R26____R27 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R26, R27]
}
check max_rules_hard_some_inc_Assertion____R26____R27 for 1

assert max_rules_hard_some_inc_Assertion____R26____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R26, R29]
}
check max_rules_hard_some_inc_Assertion____R26____R29 for 1

assert max_rules_hard_some_inc_Assertion____R26____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R26, R31]
}
check max_rules_hard_some_inc_Assertion____R26____R31 for 1

assert max_rules_hard_some_inc_Assertion____R26____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R26, R33]
}
check max_rules_hard_some_inc_Assertion____R26____R33 for 1

assert max_rules_hard_some_inc_Assertion____R26____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R26, R35]
}
check max_rules_hard_some_inc_Assertion____R26____R35 for 1

assert max_rules_hard_some_inc_Assertion____R26____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R26, R37]
}
check max_rules_hard_some_inc_Assertion____R26____R37 for 1

assert max_rules_hard_some_inc_Assertion____R26____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R26, R39]
}
check max_rules_hard_some_inc_Assertion____R26____R39 for 1

assert max_rules_hard_some_inc_Assertion____R27____R28 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R27, R28]
}
check max_rules_hard_some_inc_Assertion____R27____R28 for 1

assert max_rules_hard_some_inc_Assertion____R27____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R27, R30]
}
check max_rules_hard_some_inc_Assertion____R27____R30 for 1

assert max_rules_hard_some_inc_Assertion____R27____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R27, R32]
}
check max_rules_hard_some_inc_Assertion____R27____R32 for 1

assert max_rules_hard_some_inc_Assertion____R27____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R27, R34]
}
check max_rules_hard_some_inc_Assertion____R27____R34 for 1

assert max_rules_hard_some_inc_Assertion____R27____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R27, R36]
}
check max_rules_hard_some_inc_Assertion____R27____R36 for 1

assert max_rules_hard_some_inc_Assertion____R27____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R27, R38]
}
check max_rules_hard_some_inc_Assertion____R27____R38 for 1

assert max_rules_hard_some_inc_Assertion____R27____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R27, R40]
}
check max_rules_hard_some_inc_Assertion____R27____R40 for 1

assert max_rules_hard_some_inc_Assertion____R28____R29 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R28, R29]
}
check max_rules_hard_some_inc_Assertion____R28____R29 for 1

assert max_rules_hard_some_inc_Assertion____R28____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R28, R31]
}
check max_rules_hard_some_inc_Assertion____R28____R31 for 1

assert max_rules_hard_some_inc_Assertion____R28____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R28, R33]
}
check max_rules_hard_some_inc_Assertion____R28____R33 for 1

assert max_rules_hard_some_inc_Assertion____R28____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R28, R35]
}
check max_rules_hard_some_inc_Assertion____R28____R35 for 1

assert max_rules_hard_some_inc_Assertion____R28____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R28, R37]
}
check max_rules_hard_some_inc_Assertion____R28____R37 for 1

assert max_rules_hard_some_inc_Assertion____R28____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R28, R39]
}
check max_rules_hard_some_inc_Assertion____R28____R39 for 1

assert max_rules_hard_some_inc_Assertion____R29____R30 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R29, R30]
}
check max_rules_hard_some_inc_Assertion____R29____R30 for 1

assert max_rules_hard_some_inc_Assertion____R29____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R29, R32]
}
check max_rules_hard_some_inc_Assertion____R29____R32 for 1

assert max_rules_hard_some_inc_Assertion____R29____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R29, R34]
}
check max_rules_hard_some_inc_Assertion____R29____R34 for 1

assert max_rules_hard_some_inc_Assertion____R29____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R29, R36]
}
check max_rules_hard_some_inc_Assertion____R29____R36 for 1

assert max_rules_hard_some_inc_Assertion____R29____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R29, R38]
}
check max_rules_hard_some_inc_Assertion____R29____R38 for 1

assert max_rules_hard_some_inc_Assertion____R29____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R29, R40]
}
check max_rules_hard_some_inc_Assertion____R29____R40 for 1

assert max_rules_hard_some_inc_Assertion____R30____R31 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R30, R31]
}
check max_rules_hard_some_inc_Assertion____R30____R31 for 1

assert max_rules_hard_some_inc_Assertion____R30____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R30, R33]
}
check max_rules_hard_some_inc_Assertion____R30____R33 for 1

assert max_rules_hard_some_inc_Assertion____R30____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R30, R35]
}
check max_rules_hard_some_inc_Assertion____R30____R35 for 1

assert max_rules_hard_some_inc_Assertion____R30____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R30, R37]
}
check max_rules_hard_some_inc_Assertion____R30____R37 for 1

assert max_rules_hard_some_inc_Assertion____R30____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R30, R39]
}
check max_rules_hard_some_inc_Assertion____R30____R39 for 1

assert max_rules_hard_some_inc_Assertion____R31____R32 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R31, R32]
}
check max_rules_hard_some_inc_Assertion____R31____R32 for 1

assert max_rules_hard_some_inc_Assertion____R31____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R31, R34]
}
check max_rules_hard_some_inc_Assertion____R31____R34 for 1

assert max_rules_hard_some_inc_Assertion____R31____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R31, R36]
}
check max_rules_hard_some_inc_Assertion____R31____R36 for 1

assert max_rules_hard_some_inc_Assertion____R31____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R31, R38]
}
check max_rules_hard_some_inc_Assertion____R31____R38 for 1

assert max_rules_hard_some_inc_Assertion____R31____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R31, R40]
}
check max_rules_hard_some_inc_Assertion____R31____R40 for 1

assert max_rules_hard_some_inc_Assertion____R32____R33 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R32, R33]
}
check max_rules_hard_some_inc_Assertion____R32____R33 for 1

assert max_rules_hard_some_inc_Assertion____R32____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R32, R35]
}
check max_rules_hard_some_inc_Assertion____R32____R35 for 1

assert max_rules_hard_some_inc_Assertion____R32____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R32, R37]
}
check max_rules_hard_some_inc_Assertion____R32____R37 for 1

assert max_rules_hard_some_inc_Assertion____R32____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R32, R39]
}
check max_rules_hard_some_inc_Assertion____R32____R39 for 1

assert max_rules_hard_some_inc_Assertion____R33____R34 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R33, R34]
}
check max_rules_hard_some_inc_Assertion____R33____R34 for 1

assert max_rules_hard_some_inc_Assertion____R33____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R33, R36]
}
check max_rules_hard_some_inc_Assertion____R33____R36 for 1

assert max_rules_hard_some_inc_Assertion____R33____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R33, R38]
}
check max_rules_hard_some_inc_Assertion____R33____R38 for 1

assert max_rules_hard_some_inc_Assertion____R33____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R33, R40]
}
check max_rules_hard_some_inc_Assertion____R33____R40 for 1

assert max_rules_hard_some_inc_Assertion____R34____R35 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R34, R35]
}
check max_rules_hard_some_inc_Assertion____R34____R35 for 1

assert max_rules_hard_some_inc_Assertion____R34____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R34, R37]
}
check max_rules_hard_some_inc_Assertion____R34____R37 for 1

assert max_rules_hard_some_inc_Assertion____R34____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R34, R39]
}
check max_rules_hard_some_inc_Assertion____R34____R39 for 1

assert max_rules_hard_some_inc_Assertion____R35____R36 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R35, R36]
}
check max_rules_hard_some_inc_Assertion____R35____R36 for 1

assert max_rules_hard_some_inc_Assertion____R35____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R35, R38]
}
check max_rules_hard_some_inc_Assertion____R35____R38 for 1

assert max_rules_hard_some_inc_Assertion____R35____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R35, R40]
}
check max_rules_hard_some_inc_Assertion____R35____R40 for 1

assert max_rules_hard_some_inc_Assertion____R36____R37 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R36, R37]
}
check max_rules_hard_some_inc_Assertion____R36____R37 for 1

assert max_rules_hard_some_inc_Assertion____R36____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R36, R39]
}
check max_rules_hard_some_inc_Assertion____R36____R39 for 1

assert max_rules_hard_some_inc_Assertion____R37____R38 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R37, R38]
}
check max_rules_hard_some_inc_Assertion____R37____R38 for 1

assert max_rules_hard_some_inc_Assertion____R37____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R37, R40]
}
check max_rules_hard_some_inc_Assertion____R37____R40 for 1

assert max_rules_hard_some_inc_Assertion____R38____R39 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R38, R39]
}
check max_rules_hard_some_inc_Assertion____R38____R39 for 1

assert max_rules_hard_some_inc_Assertion____R39____R40 {
	Consistency_r[max_rules_hard_some_inc, PersonPhone, PersonPhone, R39, R40]
}
check max_rules_hard_some_inc_Assertion____R39____R40 for 1


