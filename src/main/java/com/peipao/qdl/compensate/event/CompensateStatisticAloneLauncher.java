//package com.peipao.qdl.compensate.event;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import reactor.bus.EventBus;
//
//import static reactor.bus.selector.Selectors.$;
///**
// * 方法名称：CompensateStatisticAloneLauncher
// * 功能描述：关联事件类型与事件处理程序
// * 作者：Liu Fan
// * 版本：2.0.11
// * 创建日期：2017/11/22 13:38
// * 修订记录：
// */
//
//@Order(2)
//@Component
//public class CompensateStatisticAloneLauncher implements CommandLineRunner {
//    @Autowired
//    private EventBus eventBus;
//
//    @Autowired
//    private StatisticAloneReceiverService statisticAloneReceiverService;
//
//    @Override
//    public void run(String... strings) throws RuntimeException {
//        eventBus.on($("updateUserStatisticAloneEvent"), statisticAloneReceiverService);
//    }
//}