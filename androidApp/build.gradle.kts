plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.redgas.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.example.redgas.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))

    implementation("androidx.core:core-ktx:$core_ktx")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle")

    implementation("androidx.compose.material:material:$material")
    implementation("androidx.compose.material3:material3:$material3")
    implementation("androidx.activity:activity-compose:$activity_compose")
    implementation("androidx.compose.ui:ui-tooling:$compose")
    implementation("androidx.compose.ui:ui-tooling-preview:$compose")
}
