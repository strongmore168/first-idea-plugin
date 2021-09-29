package com.imooc.firstplugin;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class FirstPlugin extends AnAction {

  @Override
  public void actionPerformed(AnActionEvent e) {
    NotificationGroup notificationGroup = new NotificationGroup("firstplugin_id",
        NotificationDisplayType.BALLOON, true);
    Notification notification = notificationGroup
        .createNotification("点击测试", NotificationType.INFORMATION);
    Notifications.Bus.notify(notification);
  }
}
