open Consistency
one sig PaperSimpleValue extends Artifact {}
one sig Paper extends Artifact {}

one sig Len1024 extends Rule {}
one sig Len3 extends Rule {}

one sig myConstraints extends Scenario {
} {
	artifacts = PaperSimpleValue + Paper
	rules = Len1024 + Len3
	givenRM = (Len1024 -> Len3) + (Len3 -> Len1024)
	givenTranslation = (Len1024 -> Len1024) + (Len3 -> Len3)
	givenRE = (Len1024 -> Len3) + (Len3 -> Len1024)
	givenE =  (PaperSimpleValue -> Len1024) + (Paper -> Len1024)
}

assert myConstraints_Assertion {
	Consistency_r[myConstraints, PaperSimpleValue, Paper, Len1024, Len3]
}

check myConstraints_Assertion for 10

