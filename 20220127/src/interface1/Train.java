package interface1;

public class Train implements Vehicle{
	
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = MIN_SPD;
		this.gas = TRAIN_MAX_GAS;
		this.name = "동길";
	}
	@Override
	public void accel() {
		if(TRAIN_INCREASE_SPD < TRAIN_MAX_SPD) {
			speed = TRAIN_MAX_SPD;
		}else {
			speed += TRAIN_INCREASE_SPD;
		}
	}
	@Override
	public void breakSpeed() {
		if(speed - TRAIN_DECREASE_SPD < MIN_ SPD) {
			speed = MIN_SPD;
		}else  {
			speed -= TRAIN_DECREASE_SPD;
		}
		
	}
	@Override
	public void reFuel() {
		if(gas + TRAIN_REFUEL)
	}
	@Override
	public void showStatus() {
		// TODO Auto-generated method stub
		
	}
}
