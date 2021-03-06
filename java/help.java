apply plugin: 'com.android.application'

android {
    compileSdkVersion 26
    defaultConfig {
        applicationId "com.naresh.kingupadhyay.mathsking"
        minSdkVersion 16
        targetSdkVersion 26
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
        multiDexEnabled true

    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
    sourceSets { main { assets.srcDirs = ['src/main/assets', 'src/main/assets/'] } }


}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation 'com.android.support:palette-v7:26.1.0'
    implementation fileTree(include: ['*.jar'], dir: 'libs')
    testImplementation 'junit:junit:4.12'
    //androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
    implementation 'com.android.support:appcompat-v7:26.1.0'
    implementation 'com.android.support:design:27.1.0'
    implementation 'com.android.support:support-v4:26.1.0'
    implementation 'com.android.support:cardview-v7:26.1.0'
    implementation 'com.android.support:recyclerview-v7:26.1.0'
    implementation 'com.thoughtbot:expandablerecyclerview:1.3'
    implementation 'com.thoughtbot:expandablecheckrecyclerview:1.4'
    implementation 'com.android.support.constraint:constraint-layout:1.1.3'
    implementation 'com.google.firebase:firebase-database:16.0.4'
    implementation 'com.google.firebase:firebase-storage:16.0.4'
    implementation 'com.google.firebase:firebase-auth:16.0.5'
    implementation 'com.firebaseui:firebase-ui-auth:3.0.0'
    implementation 'com.google.firebase:firebase-core:16.0.4'
    implementation 'com.firebaseui:firebase-ui-database:0.4.1'
    implementation 'com.google.firebase:firebase-messaging:17.3.4'
    implementation 'com.android.support:multidex:1.0.3'
    implementation 'com.squareup.picasso:picasso:2.71828'
    implementation 'jp.wasabeef:picasso-transformations:2.1.0'
    implementation 'pl.droidsonroids.gif:android-gif-drawable:1.2.14'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    implementation 'com.hbb20:ccp:2.2.2'
    implementation 'com.google.android.gms:play-services-ads:17.0.0'
    implementation 'com.google.android.gms:play-services-ads-lite:17.0.0'
    implementation 'com.google.firebase:firebase-ads:17.0.0'
    implementation 'com.facebook.android:audience-network-sdk:5.1.0-beta'
}

apply plugin: 'com.google.gms.google-services'
