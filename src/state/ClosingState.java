package state;

import context.Context;

/**
 * Created by Zongduo Li on 2021/7/22.
 */
public class ClosingState extends LiftState {

    //电梯门关了可以再开
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.getLiftState().open();
    }

    //执行电梯门关闭方法
    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    //电梯门关了就运行
    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    //电梯门关了但没有按楼层
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
