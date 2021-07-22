package state;

import context.Context;

/**
 * Created by Zongduo Li on 2021/7/22.
 */
public class RunningState extends LiftState {
    //运行时不能开门
    @Override
    public void open() {
    }

    //运行时门肯定是关的
    @Override
    public void close() {
    }

    //门开着不能运行
    @Override
    public void run() {
        //执行运行方法
        System.out.println("电梯运行中");
    }

    //运行后可以停止
    @Override
    public void stop() {
        //环境设置为停止状态
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
