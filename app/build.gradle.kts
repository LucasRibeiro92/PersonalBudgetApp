plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    kotlin("kapt")
}

android {
    namespace = "com.example.personalbudgetapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.personalbudgetapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Room
    /*
    *
    * implementation("androidx.room:room-runtime:2.3.0")
    * kapt("androidx.room:room-compiler:2.3.0")
    *
    * implementation("androidx.room:room-runtime:2.5.2")
    * kapt("androidx.room:room-compiler:2.5.2")
    * implementation("androidx.room:room-ktx:2.5.2")
    * implementation("androidx.room:room-testing:2.5.2")
    *
     * */
    implementation("androidx.room:room-runtime:2.5.0")
    implementation("androidx.room:room-ktx:2.5.0")
    kapt("androidx.room:room-compiler:2.5.0")
    implementation("androidx.room:room-testing:2.5.1")

    //Lifecycle
    /*

    * implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    * implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    *
    * */
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")

    //Koin
    /*
    * implementation("io.insert-koin:koin-core:3.2.2")
    * implementation("io.insert-koin:koin-android:3.2.2")
    *
    * */
    implementation("io.insert-koin:koin-android:3.2.0")
    implementation("io.insert-koin:koin-android-compat:3.2.0")

    //Lottie
    implementation("com.airbnb.android:lottie:6.4.0")

    //Volley
    implementation("com.android.volley:volley:1.2.1")

    //Glide
    implementation("com.github.bumptech.glide:glide:4.15.1")
    kapt("com.github.bumptech.glide:compiler:4.15.1")
}