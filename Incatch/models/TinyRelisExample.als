open Consistency
one sig PaperSimpleValue extends Artifact {}
one sig Config extends Artifact {}
one sig Paper extends Artifact {}

one sig Len1024 extends Rule {}
one sig Len32 extends Rule {}

one sig TinyRelisExample extends Scenario {
} {
	artifacts = PaperSimpleValue + Config + Paper
	rules = Sequence<Any>Len1024 + Len32 + Len32_Translated + Len3 + Len3_Translated
	givenRM = (Len1024 -> Len32) + (Len1024 -> Len3)
	givenTranslation = (Len32 -> Len32_Translated) + (Len3 -> Len3_Translated)  + (Len1024 -> Len1024)
	givenRE = (Len32_Translated -> Len1024) + (Len3_Translated -> Len1024)
	givenE = (PaperSimpleValue_Canada -> Len1024) + (PaperSimpleValue_CAN -> Len1024)
		    + (Paper_Canada -> Len32) + (Paper_CAN -> Len32) + (Paper_CAN -> Len3)
//		    + (Paper_Canada -> Len3)
}

