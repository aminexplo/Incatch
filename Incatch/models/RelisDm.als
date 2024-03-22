open Consistency
one sig relis_new_2_LC2021 extends Artifact {}
one sig relis_new_2_extremo extends Artifact {}
one sig relis_new_2_mobileapps_6252 extends Artifact {}
one sig relis_new_2_smsUpdateCollabMDE extends Artifact {}
one sig relis_new_2_rl4se extends Artifact {}
one sig relis_new_2_cps extends Artifact {}
one sig relis_new_2_da_sdf extends Artifact {}
one sig relis_new_2_da_sdg extends Artifact {}
one sig relis_new_2_LC extends Artifact {}
one sig relis_new_2_mobileAndMDE extends Artifact {}

one sig relis_new_2_LC2021_RecordLimit_8 extends Rule {}
one sig relis_new_2_extremo_RecordLimit_7 extends Rule {}
one sig relis_new_2_mobileapps_6252_RecordLimit_2 extends Rule {}
one sig relis_new_2_smsUpdateCollabMDE_RecordLimit_8 extends Rule {}
one sig relis_new_2_rl4se_RecordLimit_5 extends Rule {}
one sig relis_new_2_cps_RecordLimit_1 extends Rule {}
one sig relis_new_2_da_sdf_RecordLimit_3 extends Rule {}
one sig relis_new_2_da_sdg_RecordLimit_6 extends Rule {}
one sig relis_new_2_LC_RecordLimit_8 extends Rule {}
one sig relis_new_2_mobileAndMDE_RecordLimit_4 extends Rule {}
one sig ref_exclusioncrieria_TypeLimit_1 extends Rule {}
one sig ref_exclusioncrieria_TypeLimit_3 extends Rule {}
one sig ref_exclusioncrieria_TypeLimit_6 extends Rule {}
one sig ref_exclusioncrieria_TypeLimit_7 extends Rule {}
one sig ref_exclusioncrieria_TypeLimit_8_LC2021 extends Rule {}
one sig ref_exclusioncrieria_TypeLimit_8_MDE extends Rule {}
one sig ref_exclusioncrieria_TypeLimit_4 extends Rule {}
one sig ref_exclusioncrieria_TypeLimit_2 extends Rule {}
one sig ref_exclusioncrieria_TypeLimit_5 extends Rule {}
one sig ref_exclusioncrieria_TypeLimit_8_LC extends Rule {}

one sig RelisDm extends Scenario {
} {
	artifacts = relis_new_2_LC2021 + relis_new_2_extremo + relis_new_2_mobileapps_6252 + relis_new_2_smsUpdateCollabMDE + relis_new_2_rl4se + relis_new_2_cps + relis_new_2_da_sdf + relis_new_2_da_sdg + relis_new_2_LC + relis_new_2_mobileAndMDE
	rules = relis_new_2_extremo_RecordLimit_7 + ref_exclusioncrieria_TypeLimit_8_LC + ref_exclusioncrieria_TypeLimit_8_LC2021 + relis_new_2_LC2021_RecordLimit_8 + relis_new_2_mobileAndMDE_RecordLimit_4 + relis_new_2_smsUpdateCollabMDE_RecordLimit_8 + ref_exclusioncrieria_TypeLimit_8_MDE + relis_new_2_da_sdf_RecordLimit_3 + relis_new_2_rl4se_RecordLimit_5 + relis_new_2_mobileapps_6252_RecordLimit_2 + relis_new_2_cps_RecordLimit_1 + relis_new_2_da_sdg_RecordLimit_6 + ref_exclusioncrieria_TypeLimit_7 + ref_exclusioncrieria_TypeLimit_6 + ref_exclusioncrieria_TypeLimit_5 + ref_exclusioncrieria_TypeLimit_4 + ref_exclusioncrieria_TypeLimit_3 + ref_exclusioncrieria_TypeLimit_2 + ref_exclusioncrieria_TypeLimit_1 + relis_new_2_LC_RecordLimit_8
	givenRM = (relis_new_2_LC2021_RecordLimit_8 -> ref_exclusioncrieria_TypeLimit_8_LC2021) + (relis_new_2_extremo_RecordLimit_7 -> ref_exclusioncrieria_TypeLimit_7) + (relis_new_2_mobileapps_6252_RecordLimit_2 -> ref_exclusioncrieria_TypeLimit_2) + (relis_new_2_smsUpdateCollabMDE_RecordLimit_8 -> ref_exclusioncrieria_TypeLimit_8_LC2021) + (relis_new_2_rl4se_RecordLimit_5 -> ref_exclusioncrieria_TypeLimit_5) + (relis_new_2_cps_RecordLimit_1 -> ref_exclusioncrieria_TypeLimit_1) + (relis_new_2_da_sdf_RecordLimit_3 -> ref_exclusioncrieria_TypeLimit_3) + (relis_new_2_da_sdg_RecordLimit_6 -> ref_exclusioncrieria_TypeLimit_6) + (relis_new_2_LC_RecordLimit_8 -> ref_exclusioncrieria_TypeLimit_8_LC2021) + (relis_new_2_mobileAndMDE_RecordLimit_4 -> ref_exclusioncrieria_TypeLimit_4) + (ref_exclusioncrieria_TypeLimit_1 -> relis_new_2_cps_RecordLimit_1) + (ref_exclusioncrieria_TypeLimit_3 -> relis_new_2_da_sdf_RecordLimit_3) + (ref_exclusioncrieria_TypeLimit_6 -> relis_new_2_da_sdg_RecordLimit_6) + (ref_exclusioncrieria_TypeLimit_7 -> relis_new_2_extremo_RecordLimit_7) + (ref_exclusioncrieria_TypeLimit_8_LC2021 -> relis_new_2_LC2021_RecordLimit_8) + (ref_exclusioncrieria_TypeLimit_8_MDE -> relis_new_2_smsUpdateCollabMDE_RecordLimit_8) + (ref_exclusioncrieria_TypeLimit_4 -> relis_new_2_mobileAndMDE_RecordLimit_4) + (ref_exclusioncrieria_TypeLimit_2 -> relis_new_2_mobileapps_6252_RecordLimit_2) + (ref_exclusioncrieria_TypeLimit_5 -> relis_new_2_rl4se_RecordLimit_5) + (ref_exclusioncrieria_TypeLimit_8_LC -> relis_new_2_LC_RecordLimit_8) 
	givenTranslation = (ref_exclusioncrieria_TypeLimit_7 -> ref_exclusioncrieria_TypeLimit_7) + (ref_exclusioncrieria_TypeLimit_4 -> ref_exclusioncrieria_TypeLimit_4) + (relis_new_2_LC2021_RecordLimit_8 -> relis_new_2_LC2021_RecordLimit_8) + (ref_exclusioncrieria_TypeLimit_1 -> ref_exclusioncrieria_TypeLimit_1) + (ref_exclusioncrieria_TypeLimit_2 -> ref_exclusioncrieria_TypeLimit_2) + (relis_new_2_da_sdf_RecordLimit_3 -> relis_new_2_da_sdf_RecordLimit_3) + (ref_exclusioncrieria_TypeLimit_5 -> ref_exclusioncrieria_TypeLimit_5) + (ref_exclusioncrieria_TypeLimit_8_MDE -> ref_exclusioncrieria_TypeLimit_8_MDE) + (relis_new_2_rl4se_RecordLimit_5 -> relis_new_2_rl4se_RecordLimit_5) + (relis_new_2_da_sdg_RecordLimit_6 -> relis_new_2_da_sdg_RecordLimit_6) + (relis_new_2_extremo_RecordLimit_7 -> relis_new_2_extremo_RecordLimit_7) + (relis_new_2_mobileapps_6252_RecordLimit_2 -> relis_new_2_mobileapps_6252_RecordLimit_2) + (relis_new_2_mobileAndMDE_RecordLimit_4 -> relis_new_2_mobileAndMDE_RecordLimit_4) + (relis_new_2_smsUpdateCollabMDE_RecordLimit_8 -> relis_new_2_smsUpdateCollabMDE_RecordLimit_8) + (ref_exclusioncrieria_TypeLimit_6 -> ref_exclusioncrieria_TypeLimit_6) + (ref_exclusioncrieria_TypeLimit_3 -> ref_exclusioncrieria_TypeLimit_3) + (relis_new_2_LC_RecordLimit_8 -> relis_new_2_LC_RecordLimit_8) + (relis_new_2_cps_RecordLimit_1 -> relis_new_2_cps_RecordLimit_1) + (ref_exclusioncrieria_TypeLimit_8_LC2021 -> ref_exclusioncrieria_TypeLimit_8_LC2021) + (ref_exclusioncrieria_TypeLimit_8_LC -> ref_exclusioncrieria_TypeLimit_8_LC)
	givenRE = (relis_new_2_LC2021_RecordLimit_8 -> ref_exclusioncrieria_TypeLimit_8_LC2021) + (relis_new_2_extremo_RecordLimit_7 -> ref_exclusioncrieria_TypeLimit_7) + (relis_new_2_mobileapps_6252_RecordLimit_2 -> ref_exclusioncrieria_TypeLimit_2) + (relis_new_2_smsUpdateCollabMDE_RecordLimit_8 -> ref_exclusioncrieria_TypeLimit_8_LC2021) + (relis_new_2_rl4se_RecordLimit_5 -> ref_exclusioncrieria_TypeLimit_5) + (relis_new_2_cps_RecordLimit_1 -> ref_exclusioncrieria_TypeLimit_1) + (relis_new_2_da_sdf_RecordLimit_3 -> ref_exclusioncrieria_TypeLimit_3) + (relis_new_2_da_sdg_RecordLimit_6 -> ref_exclusioncrieria_TypeLimit_6) + (relis_new_2_LC_RecordLimit_8 -> ref_exclusioncrieria_TypeLimit_8_LC2021) + (relis_new_2_mobileAndMDE_RecordLimit_4 -> ref_exclusioncrieria_TypeLimit_4) + (ref_exclusioncrieria_TypeLimit_1 -> relis_new_2_cps_RecordLimit_1) + (ref_exclusioncrieria_TypeLimit_3 -> relis_new_2_da_sdf_RecordLimit_3) + (ref_exclusioncrieria_TypeLimit_6 -> relis_new_2_da_sdg_RecordLimit_6) + (ref_exclusioncrieria_TypeLimit_7 -> relis_new_2_extremo_RecordLimit_7) + (ref_exclusioncrieria_TypeLimit_8_LC2021 -> relis_new_2_LC2021_RecordLimit_8) + (ref_exclusioncrieria_TypeLimit_8_MDE -> relis_new_2_smsUpdateCollabMDE_RecordLimit_8) + (ref_exclusioncrieria_TypeLimit_4 -> relis_new_2_mobileAndMDE_RecordLimit_4) + (ref_exclusioncrieria_TypeLimit_2 -> relis_new_2_mobileapps_6252_RecordLimit_2) + (ref_exclusioncrieria_TypeLimit_5 -> relis_new_2_rl4se_RecordLimit_5) + (ref_exclusioncrieria_TypeLimit_8_LC -> relis_new_2_LC_RecordLimit_8) 
	givenE =  (relis_new_2_LC2021 -> relis_new_2_LC2021_RecordLimit_8) + (relis_new_2_rl4se -> relis_new_2_rl4se_RecordLimit_5) + (relis_new_2_LC -> relis_new_2_LC_RecordLimit_8) + (relis_new_2_mobileAndMDE -> relis_new_2_mobileAndMDE_RecordLimit_4) + (relis_new_2_smsUpdateCollabMDE -> relis_new_2_smsUpdateCollabMDE_RecordLimit_8)
}

assert RelisDm_Assertion____relis_new_2_LC2021_RecordLimit_8____ref_exclusioncrieria_TypeLimit_8_LC2021 {
	Consistency_r[RelisDm, relis_new_2_LC2021, relis_new_2_LC, relis_new_2_LC2021_RecordLimit_8, ref_exclusioncrieria_TypeLimit_8_LC2021]
}
check RelisDm_Assertion____relis_new_2_LC2021_RecordLimit_8____ref_exclusioncrieria_TypeLimit_8_LC2021 for 1

assert RelisDm_Assertion____relis_new_2_extremo_RecordLimit_7____ref_exclusioncrieria_TypeLimit_7 {
	Consistency_r[RelisDm, relis_new_2_extremo, relis_new_2_extremo, relis_new_2_extremo_RecordLimit_7, ref_exclusioncrieria_TypeLimit_7]
}
check RelisDm_Assertion____relis_new_2_extremo_RecordLimit_7____ref_exclusioncrieria_TypeLimit_7 for 1

assert RelisDm_Assertion____relis_new_2_mobileapps_6252_RecordLimit_2____ref_exclusioncrieria_TypeLimit_2 {
	Consistency_r[RelisDm, relis_new_2_mobileapps_6252, relis_new_2_mobileapps_6252, relis_new_2_mobileapps_6252_RecordLimit_2, ref_exclusioncrieria_TypeLimit_2]
}
check RelisDm_Assertion____relis_new_2_mobileapps_6252_RecordLimit_2____ref_exclusioncrieria_TypeLimit_2 for 1

assert RelisDm_Assertion____relis_new_2_smsUpdateCollabMDE_RecordLimit_8____ref_exclusioncrieria_TypeLimit_8_LC2021 {
	Consistency_r[RelisDm, relis_new_2_smsUpdateCollabMDE, relis_new_2_LC, relis_new_2_smsUpdateCollabMDE_RecordLimit_8, ref_exclusioncrieria_TypeLimit_8_LC2021]
}
check RelisDm_Assertion____relis_new_2_smsUpdateCollabMDE_RecordLimit_8____ref_exclusioncrieria_TypeLimit_8_LC2021 for 1

assert RelisDm_Assertion____relis_new_2_rl4se_RecordLimit_5____ref_exclusioncrieria_TypeLimit_5 {
	Consistency_r[RelisDm, relis_new_2_rl4se, relis_new_2_rl4se, relis_new_2_rl4se_RecordLimit_5, ref_exclusioncrieria_TypeLimit_5]
}
check RelisDm_Assertion____relis_new_2_rl4se_RecordLimit_5____ref_exclusioncrieria_TypeLimit_5 for 1

assert RelisDm_Assertion____relis_new_2_cps_RecordLimit_1____ref_exclusioncrieria_TypeLimit_1 {
	Consistency_r[RelisDm, relis_new_2_cps, relis_new_2_cps, relis_new_2_cps_RecordLimit_1, ref_exclusioncrieria_TypeLimit_1]
}
check RelisDm_Assertion____relis_new_2_cps_RecordLimit_1____ref_exclusioncrieria_TypeLimit_1 for 1

assert RelisDm_Assertion____relis_new_2_da_sdf_RecordLimit_3____ref_exclusioncrieria_TypeLimit_3 {
	Consistency_r[RelisDm, relis_new_2_da_sdf, relis_new_2_da_sdf, relis_new_2_da_sdf_RecordLimit_3, ref_exclusioncrieria_TypeLimit_3]
}
check RelisDm_Assertion____relis_new_2_da_sdf_RecordLimit_3____ref_exclusioncrieria_TypeLimit_3 for 1

assert RelisDm_Assertion____relis_new_2_da_sdg_RecordLimit_6____ref_exclusioncrieria_TypeLimit_6 {
	Consistency_r[RelisDm, relis_new_2_da_sdg, relis_new_2_da_sdg, relis_new_2_da_sdg_RecordLimit_6, ref_exclusioncrieria_TypeLimit_6]
}
check RelisDm_Assertion____relis_new_2_da_sdg_RecordLimit_6____ref_exclusioncrieria_TypeLimit_6 for 1

assert RelisDm_Assertion____relis_new_2_LC_RecordLimit_8____ref_exclusioncrieria_TypeLimit_8_LC2021 {
	Consistency_r[RelisDm, relis_new_2_LC, relis_new_2_LC, relis_new_2_LC_RecordLimit_8, ref_exclusioncrieria_TypeLimit_8_LC2021]
}
check RelisDm_Assertion____relis_new_2_LC_RecordLimit_8____ref_exclusioncrieria_TypeLimit_8_LC2021 for 1

assert RelisDm_Assertion____relis_new_2_mobileAndMDE_RecordLimit_4____ref_exclusioncrieria_TypeLimit_4 {
	Consistency_r[RelisDm, relis_new_2_mobileAndMDE, relis_new_2_mobileAndMDE, relis_new_2_mobileAndMDE_RecordLimit_4, ref_exclusioncrieria_TypeLimit_4]
}
check RelisDm_Assertion____relis_new_2_mobileAndMDE_RecordLimit_4____ref_exclusioncrieria_TypeLimit_4 for 1

assert RelisDm_Assertion____ref_exclusioncrieria_TypeLimit_8_MDE____relis_new_2_smsUpdateCollabMDE_RecordLimit_8 {
	Consistency_r[RelisDm, relis_new_2_LC2021, relis_new_2_smsUpdateCollabMDE, ref_exclusioncrieria_TypeLimit_8_MDE, relis_new_2_smsUpdateCollabMDE_RecordLimit_8]
}
check RelisDm_Assertion____ref_exclusioncrieria_TypeLimit_8_MDE____relis_new_2_smsUpdateCollabMDE_RecordLimit_8 for 1


