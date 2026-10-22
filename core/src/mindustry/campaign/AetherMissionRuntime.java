package mindustry.campaign;

/** Small deterministic runtime for completing Act 1 missions and awarding campaign rewards. */
public final class AetherMissionRuntime{
    private final AetherCampaignState state;

    public AetherMissionRuntime(AetherCampaignState state){
        this.state = state;
    }

    public boolean completeMission(String missionId){
        for(AetherAct1.Mission mission : AetherAct1.missions()){
            if(mission.id().equals(missionId)){
                state.completeMission(missionId);
                if(missionId.equals("act01_m04")){
                    state.reward(500, 1000, 100);
                    state.completeAct(1);
                }
                return true;
            }
        }
        return false;
    }

    public AetherCampaignState state(){ return state; }
}
