package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebaseadmob.FirebaseAdMobPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin());
      com.hemanthraj.fluttercompass.FlutterCompassPlugin.registerWith(shimPluginRegistry.registrarFor("com.hemanthraj.fluttercompass.FlutterCompassPlugin"));
    flutterEngine.getPlugins().add(new com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin());
      com.nover.flutternativeadmob.FlutterNativeAdmobPlugin.registerWith(shimPluginRegistry.registrarFor("com.nover.flutternativeadmob.FlutterNativeAdmobPlugin"));
    flutterEngine.getPlugins().add(new ml.medyas.flutter_qiblah.FlutterQiblahPlugin());
    flutterEngine.getPlugins().add(new com.baseflow.geolocator.GeolocatorPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
  }
}
