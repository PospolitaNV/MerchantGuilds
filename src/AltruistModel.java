public class AltruistModel extends BehaviorModel {

  public AltruistModel(){
    behaviorName = "Альтруист";
  }

  @Override
  public int getDecision(){
    int decision = FAIR;
    if (mistake())
      decision = reverseDesicion(decision);
    return decision;
  }

  @Override
  public void update(int partnerDecision){
    //Do nothing
  }
}