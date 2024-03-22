open Consistency
one sig PersonPhone extends Artifact {}

one sig R2 extends Rule {}
one sig R1 extends Rule {}

one sig LocoDs extends Scenario {
} {
	artifacts = PersonPhone
	rules = R2 + R1
	givenRM = (R2 -> R1) + (R1 -> R2) 
	givenTranslation = (R2 -> R2) + (R1 -> R1)
	givenRE = (R2 -> R1) + (R1 -> R2) 
	givenE =  none -> none
}

assert LocoDs_Assertion____R2____R1 {
	Consistency_r[LocoDs, PersonPhone, PersonPhone, R2, R1]
}
check LocoDs_Assertion____R2____R1 for 1


