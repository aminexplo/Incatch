open Consistency
one sig PaperSimpleValue extends Artifact {}
one sig ConfigFile extends Artifact {}

one sig PaperSimpleValue_Value_Len_1024 extends Rule {}
one sig Size_3 extends Rule {}

one sig ConstraintCollection extends Scenario {
} {
	artifacts = PaperSimpleValue + ConfigFile
	rules = PaperSimpleValue_Value_Len_1024 + Size_3
	givenRM = (PaperSimpleValue_Value_Len_1024 -> Size_3) + (Size_3 -> PaperSimpleValue_Value_Len_1024)
	givenTranslation = (PaperSimpleValue_Value_Len_1024 -> PaperSimpleValue_Value_Len_1024) + (Size_3 -> Size_3)
	givenRE = (PaperSimpleValue_Value_Len_1024 -> Size_3) + (Size_3 -> PaperSimpleValue_Value_Len_1024)
	givenE =  (PaperSimpleValue -> PaperSimpleValue_Value_Len_1024) + (ConfigFile -> PaperSimpleValue_Value_Len_1024)
}

assert ConstraintCollection_Assertion {
	Consistency_r[ConstraintCollection, PaperSimpleValue, ConfigFile, PaperSimpleValue_Value_Len_1024, Size_3]
}

check ConstraintCollection_Assertion for 10

