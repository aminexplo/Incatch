open Consistency
one sig Assignment extends Artifact {}

one sig Assignment_RecordLimit_2 extends Rule {}
one sig Senior_TypeLimit_1 extends Rule {}
one sig Junior_TypeLimit_2 extends Rule {}

one sig min_paperProblem_easy_all_inc extends Scenario {
} {
	artifacts = Assignment
	rules = Junior_TypeLimit_2 + Senior_TypeLimit_1 + Assignment_RecordLimit_2
	givenRM = (Assignment_RecordLimit_2 -> Junior_TypeLimit_2) + (Assignment_RecordLimit_2 -> Senior_TypeLimit_1) + (Senior_TypeLimit_1 -> Assignment_RecordLimit_2) + (Junior_TypeLimit_2 -> Assignment_RecordLimit_2) 
	givenTranslation = (Senior_TypeLimit_1 -> Senior_TypeLimit_1) + (Junior_TypeLimit_2 -> Junior_TypeLimit_2) + (Assignment_RecordLimit_2 -> Assignment_RecordLimit_2)
	givenRE = (Assignment_RecordLimit_2 -> Junior_TypeLimit_2) + (Assignment_RecordLimit_2 -> Senior_TypeLimit_1) + (Senior_TypeLimit_1 -> Assignment_RecordLimit_2) + (Junior_TypeLimit_2 -> Assignment_RecordLimit_2) 
	givenE =  (Assignment -> Assignment_RecordLimit_2)
}

assert min_paperProblem_easy_all_inc_Assertion____Assignment_RecordLimit_2____Senior_TypeLimit_1 {
	Consistency_r[min_paperProblem_easy_all_inc, Assignment, Assignment, Assignment_RecordLimit_2, Senior_TypeLimit_1]
}
check min_paperProblem_easy_all_inc_Assertion____Assignment_RecordLimit_2____Senior_TypeLimit_1 for 1

assert min_paperProblem_easy_all_inc_Assertion____Assignment_RecordLimit_2____Junior_TypeLimit_2 {
	Consistency_r[min_paperProblem_easy_all_inc, Assignment, Assignment, Assignment_RecordLimit_2, Junior_TypeLimit_2]
}
check min_paperProblem_easy_all_inc_Assertion____Assignment_RecordLimit_2____Junior_TypeLimit_2 for 1


