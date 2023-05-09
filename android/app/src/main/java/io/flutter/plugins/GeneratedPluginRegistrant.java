package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import flutter.plugins.contactsservice.contactsservice.ContactsServicePlugin;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin;
import com.baseflow.permissionhandler.PermissionHandlerPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import com.babariviere.sms.SmsPlugin;
import com.tekartik.sqflite.SqflitePlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    ContactsServicePlugin.registerWith(registry.registrarFor("flutter.plugins.contactsservice.contactsservice.ContactsServicePlugin"));
    FlutterLocalNotificationsPlugin.registerWith(registry.registrarFor("com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin"));
    FlutterToastPlugin.registerWith(registry.registrarFor("io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin"));
    PermissionHandlerPlugin.registerWith(registry.registrarFor("com.baseflow.permissionhandler.PermissionHandlerPlugin"));
    SharedPreferencesPlugin.registerWith(registry.registrarFor("io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin"));
    SmsPlugin.registerWith(registry.registrarFor("com.babariviere.sms.SmsPlugin"));
    SqflitePlugin.registerWith(registry.registrarFor("com.tekartik.sqflite.SqflitePlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
