import context.Context;
import state.ClosingState;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		//定义初始状态为关门（共四种初始值）
		context.setLiftState(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();
	}

}
