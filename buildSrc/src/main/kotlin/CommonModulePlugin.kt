import com.android.build.gradle.AppExtension
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class CommonModulePlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.plugins.apply("kotlin-android")
        project.plugins.apply("kotlin-kapt")
        project.plugins.apply("dagger.hilt.android.plugin")

        val androidExtensions = project.extensions.getByName("android")
        if (androidExtensions is BaseExtension) {
            androidExtensions.apply {
                compileSdkVersion(30)
                buildToolsVersion = "30.0.3"

                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_1_8
                    targetCompatibility = JavaVersion.VERSION_1_8
                }

                project.tasks.withType<KotlinCompile> {
                    kotlinOptions {
                        jvmTarget = JavaVersion.VERSION_1_8.toString()
                    }
                }

                testOptions {
                    unitTests.isReturnDefaultValues = true
                }

                defaultConfig {
                    minSdk = 21
                    targetSdk = 30
                    versionCode = 1
                    versionName = "1.0"

                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }

                buildFeatures.viewBinding = true

                when (this) {
                    is LibraryExtension -> {
                        defaultConfig {
                            consumerProguardFiles("consumer-rules.pro")
                        }
                    }

                    is AppExtension -> {
                        buildTypes {
                            getByName("release") {
                                isMinifyEnabled = false
                                proguardFiles(
                                    getDefaultProguardFile("proguard-android-optimize.txt"),
                                    "proguard-rules.pro"
                                )
                            }
                        }
                    }
                }
            }
        }

        project.dependencies {
            add("implementation", "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.20")
            add("implementation", "androidx.core:core-ktx:1.6.0")
            add("implementation", "androidx.appcompat:appcompat:1.3.0")
            add("implementation", "com.google.android.material:material:1.4.0")
            add("implementation", "androidx.constraintlayout:constraintlayout:2.0.4")

            add("implementation", "com.google.dagger:hilt-android:2.37")
            add("kapt", "com.google.dagger:hilt-android-compiler:2.37")

            add("testImplementation", "junit:junit:4.13.2")
        }
    }
}