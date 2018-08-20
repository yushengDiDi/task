package test.serviceImpl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import test.service.taskService;

/**
 * Created by Administrator on 2018/8/20.
 */
@Component
public class taskServiceImpl implements taskService {

    @Scheduled(cron = "0/10 * * * * ? ") // 间隔5秒执行
    @Override
    public void taskTest() {
        System.out.println("使用SpringMVC框架配置定时任务");
    }
}
