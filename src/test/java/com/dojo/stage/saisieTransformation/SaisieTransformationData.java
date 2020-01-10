package com.dojo.stage.saisieTransformation;

import com.dojo.stage.domain.SaisieTransformation;
import com.dojo.stage.domain.SaisieTransformationRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SaisieTransformationData {

    public static int loadData(SaisieTransformationRepository saisieTransformationRepository) {
        saisieTransformationRepository.save(SaisieTransformationData.generate(1));
        saisieTransformationRepository.save(SaisieTransformationData.generate(2));
        saisieTransformationRepository.save(SaisieTransformationData.generate(3));
        return 3;
    }

    public static SaisieTransformation generate(int id){
        switch (id){
            case 1: return new SaisieTransformation( 1L, "XX0001", "domaine", "equipe", "profil", "competences");
            case 2: return new SaisieTransformation( 2L, "138258", "ResBPFCBP", "CBP08674Eq4", "ConseilFrontBPF(CBP EQUIPE MONTPELLIER ROUSSILLON 4)", "C_BPF_CENTREBPF|1|1|PHONE|INCOMING");
            case 3: return new SaisieTransformation( 3L, "x85066", "ResRetail", "CBP08587Eq1", "ConseilFrontRet(PILOTAGE ET ANIMATION COMMERCIALE RETAIL REGION PARIS)", "C_RET_ENTREPRENEUR|1|1|PHONE|INCOMING,C_RET_PRO_ER|1|1|PHONE|INCOMING");
            default: return null;
        }
    }
}
