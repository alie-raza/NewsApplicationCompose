package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final ComLibraryAccessors laccForComLibraryAccessors = new ComLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final ComposeIconsLibraryAccessors laccForComposeIconsLibraryAccessors = new ComposeIconsLibraryAccessors(owner);
    private final IoLibraryAccessors laccForIoLibraryAccessors = new IoLibraryAccessors(owner);
    private final KamelLibraryAccessors laccForKamelLibraryAccessors = new KamelLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final KtorLibraryAccessors laccForKtorLibraryAccessors = new KtorLibraryAccessors(owner);
    private final MokoLibraryAccessors laccForMokoLibraryAccessors = new MokoLibraryAccessors(owner);
    private final PrecomposeLibraryAccessors laccForPrecomposeLibraryAccessors = new PrecomposeLibraryAccessors(owner);
    private final VoyagerLibraryAccessors laccForVoyagerLibraryAccessors = new VoyagerLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for composeImageLoader (io.github.qdsfdhvh:image-loader)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getComposeImageLoader() {
            return create("composeImageLoader");
    }

        /**
         * Creates a dependency provider for libres (io.github.skeptick.libres:libres-compose)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLibres() {
            return create("libres");
    }

        /**
         * Creates a dependency provider for multiplatformSettings (com.russhwolf:multiplatform-settings)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMultiplatformSettings() {
            return create("multiplatformSettings");
    }

        /**
         * Creates a dependency provider for napier (io.github.aakira:napier)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getNapier() {
            return create("napier");
    }

        /**
         * Creates a dependency provider for skiko (org.jetbrains.skiko:skiko)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSkiko() {
            return create("skiko");
    }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at com
     */
    public ComLibraryAccessors getCom() {
        return laccForComLibraryAccessors;
    }

    /**
     * Returns the group of libraries at compose
     */
    public ComposeLibraryAccessors getCompose() {
        return laccForComposeLibraryAccessors;
    }

    /**
     * Returns the group of libraries at composeIcons
     */
    public ComposeIconsLibraryAccessors getComposeIcons() {
        return laccForComposeIconsLibraryAccessors;
    }

    /**
     * Returns the group of libraries at io
     */
    public IoLibraryAccessors getIo() {
        return laccForIoLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kamel
     */
    public KamelLibraryAccessors getKamel() {
        return laccForKamelLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlinx
     */
    public KotlinxLibraryAccessors getKotlinx() {
        return laccForKotlinxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at ktor
     */
    public KtorLibraryAccessors getKtor() {
        return laccForKtorLibraryAccessors;
    }

    /**
     * Returns the group of libraries at moko
     */
    public MokoLibraryAccessors getMoko() {
        return laccForMokoLibraryAccessors;
    }

    /**
     * Returns the group of libraries at precompose
     */
    public PrecomposeLibraryAccessors getPrecompose() {
        return laccForPrecomposeLibraryAccessors;
    }

    /**
     * Returns the group of libraries at voyager
     */
    public VoyagerLibraryAccessors getVoyager() {
        return laccForVoyagerLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activityCompose (androidx.activity:activity-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getActivityCompose() {
                return create("androidx.activityCompose");
        }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() {
                return create("androidx.appcompat");
        }

        /**
         * Returns the group of libraries at androidx.core
         */
        public AndroidxCoreLibraryAccessors getCore() {
            return laccForAndroidxCoreLibraryAccessors;
        }

    }

    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for i18n (androidx.core:core-i18n)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getI18n() {
                return create("androidx.core.i18n");
        }

    }

    public static class ComLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleLibraryAccessors laccForComGoogleLibraryAccessors = new ComGoogleLibraryAccessors(owner);

        public ComLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google
         */
        public ComGoogleLibraryAccessors getGoogle() {
            return laccForComGoogleLibraryAccessors;
        }

    }

    public static class ComGoogleLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleCodeLibraryAccessors laccForComGoogleCodeLibraryAccessors = new ComGoogleCodeLibraryAccessors(owner);

        public ComGoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.code
         */
        public ComGoogleCodeLibraryAccessors getCode() {
            return laccForComGoogleCodeLibraryAccessors;
        }

    }

    public static class ComGoogleCodeLibraryAccessors extends SubDependencyFactory {

        public ComGoogleCodeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gson (com.google.code.gson:gson)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGson() {
                return create("com.google.code.gson");
        }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for uitooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUitooling() {
                return create("compose.uitooling");
        }

    }

    public static class ComposeIconsLibraryAccessors extends SubDependencyFactory {

        public ComposeIconsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for featherIcons (br.com.devsrsouza.compose.icons:feather)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFeatherIcons() {
                return create("composeIcons.featherIcons");
        }

    }

    public static class IoLibraryAccessors extends SubDependencyFactory {
        private final IoKtorLibraryAccessors laccForIoKtorLibraryAccessors = new IoKtorLibraryAccessors(owner);

        public IoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.ktor
         */
        public IoKtorLibraryAccessors getKtor() {
            return laccForIoKtorLibraryAccessors;
        }

    }

    public static class IoKtorLibraryAccessors extends SubDependencyFactory {
        private final IoKtorClientLibraryAccessors laccForIoKtorClientLibraryAccessors = new IoKtorClientLibraryAccessors(owner);
        private final IoKtorKtorLibraryAccessors laccForIoKtorKtorLibraryAccessors = new IoKtorKtorLibraryAccessors(owner);
        private final IoKtorServerLibraryAccessors laccForIoKtorServerLibraryAccessors = new IoKtorServerLibraryAccessors(owner);

        public IoKtorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.ktor.client
         */
        public IoKtorClientLibraryAccessors getClient() {
            return laccForIoKtorClientLibraryAccessors;
        }

        /**
         * Returns the group of libraries at io.ktor.ktor
         */
        public IoKtorKtorLibraryAccessors getKtor() {
            return laccForIoKtorKtorLibraryAccessors;
        }

        /**
         * Returns the group of libraries at io.ktor.server
         */
        public IoKtorServerLibraryAccessors getServer() {
            return laccForIoKtorServerLibraryAccessors;
        }

    }

    public static class IoKtorClientLibraryAccessors extends SubDependencyFactory {
        private final IoKtorClientContentLibraryAccessors laccForIoKtorClientContentLibraryAccessors = new IoKtorClientContentLibraryAccessors(owner);

        public IoKtorClientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.ktor.client.content
         */
        public IoKtorClientContentLibraryAccessors getContent() {
            return laccForIoKtorClientContentLibraryAccessors;
        }

    }

    public static class IoKtorClientContentLibraryAccessors extends SubDependencyFactory {

        public IoKtorClientContentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for negotiation (io.ktor:ktor-client-content-negotiation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNegotiation() {
                return create("io.ktor.client.content.negotiation");
        }

    }

    public static class IoKtorKtorLibraryAccessors extends SubDependencyFactory {
        private final IoKtorKtorClientLibraryAccessors laccForIoKtorKtorClientLibraryAccessors = new IoKtorKtorClientLibraryAccessors(owner);

        public IoKtorKtorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.ktor.ktor.client
         */
        public IoKtorKtorClientLibraryAccessors getClient() {
            return laccForIoKtorKtorClientLibraryAccessors;
        }

    }

    public static class IoKtorKtorClientLibraryAccessors extends SubDependencyFactory {

        public IoKtorKtorClientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for serialization (io.ktor:ktor-serialization-kotlinx-json)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSerialization() {
                return create("io.ktor.ktor.client.serialization");
        }

    }

    public static class IoKtorServerLibraryAccessors extends SubDependencyFactory {
        private final IoKtorServerDefaultLibraryAccessors laccForIoKtorServerDefaultLibraryAccessors = new IoKtorServerDefaultLibraryAccessors(owner);

        public IoKtorServerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.ktor.server.default
         */
        public IoKtorServerDefaultLibraryAccessors getDefault() {
            return laccForIoKtorServerDefaultLibraryAccessors;
        }

    }

    public static class IoKtorServerDefaultLibraryAccessors extends SubDependencyFactory {

        public IoKtorServerDefaultLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for headers (io.ktor:ktor-server-default-headers)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHeaders() {
                return create("io.ktor.server.default.headers");
        }

    }

    public static class KamelLibraryAccessors extends SubDependencyFactory {

        public KamelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for image (media.kamel:kamel-image)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getImage() {
                return create("kamel.image");
        }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);
        private final KotlinxSerializationLibraryAccessors laccForKotlinxSerializationLibraryAccessors = new KotlinxSerializationLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for datetime (org.jetbrains.kotlinx:kotlinx-datetime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatetime() {
                return create("kotlinx.datetime");
        }

        /**
         * Returns the group of libraries at kotlinx.coroutines
         */
        public KotlinxCoroutinesLibraryAccessors getCoroutines() {
            return laccForKotlinxCoroutinesLibraryAccessors;
        }

        /**
         * Returns the group of libraries at kotlinx.serialization
         */
        public KotlinxSerializationLibraryAccessors getSerialization() {
            return laccForKotlinxSerializationLibraryAccessors;
        }

    }

    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("kotlinx.coroutines.android");
        }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("kotlinx.coroutines.core");
        }

    }

    public static class KotlinxSerializationLibraryAccessors extends SubDependencyFactory {

        public KotlinxSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for json (org.jetbrains.kotlinx:kotlinx-serialization-json)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJson() {
                return create("kotlinx.serialization.json");
        }

    }

    public static class KtorLibraryAccessors extends SubDependencyFactory {
        private final KtorClientLibraryAccessors laccForKtorClientLibraryAccessors = new KtorClientLibraryAccessors(owner);

        public KtorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (io.ktor:ktor-client-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("ktor.core");
        }

        /**
         * Returns the group of libraries at ktor.client
         */
        public KtorClientLibraryAccessors getClient() {
            return laccForKtorClientLibraryAccessors;
        }

    }

    public static class KtorClientLibraryAccessors extends SubDependencyFactory {

        public KtorClientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for darwin (io.ktor:ktor-client-darwin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDarwin() {
                return create("ktor.client.darwin");
        }

            /**
             * Creates a dependency provider for logging (io.ktor:ktor-client-logging)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLogging() {
                return create("ktor.client.logging");
        }

            /**
             * Creates a dependency provider for okhttp (io.ktor:ktor-client-okhttp)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOkhttp() {
                return create("ktor.client.okhttp");
        }

    }

    public static class MokoLibraryAccessors extends SubDependencyFactory {

        public MokoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for mvvm (dev.icerock.moko:mvvm-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMvvm() {
                return create("moko.mvvm");
        }

    }

    public static class PrecomposeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public PrecomposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for precompose (moe.tlaster:precompose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("precompose");
        }

            /**
             * Creates a dependency provider for viewmodel (moe.tlaster:precompose-viewmodel)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewmodel() {
                return create("precompose.viewmodel");
        }

    }

    public static class VoyagerLibraryAccessors extends SubDependencyFactory {

        public VoyagerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for navigator (cafe.adriel.voyager:voyager-navigator)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNavigator() {
                return create("voyager.navigator");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final ComposeVersionAccessors vaccForComposeVersionAccessors = new ComposeVersionAccessors(providers, config);
        private final KotlinxVersionAccessors vaccForKotlinxVersionAccessors = new KotlinxVersionAccessors(providers, config);
        private final MokoVersionAccessors vaccForMokoVersionAccessors = new MokoVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: agp (8.1.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAgp() { return getVersion("agp"); }

            /**
             * Returns the version associated to this alias: composeIcons (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getComposeIcons() { return getVersion("composeIcons"); }

            /**
             * Returns the version associated to this alias: composeImageLoader (1.7.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getComposeImageLoader() { return getVersion("composeImageLoader"); }

            /**
             * Returns the version associated to this alias: gson (2.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGson() { return getVersion("gson"); }

            /**
             * Returns the version associated to this alias: kamelImage (0.8.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKamelImage() { return getVersion("kamelImage"); }

            /**
             * Returns the version associated to this alias: kotlin (1.9.20)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: ktor (2.3.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtor() { return getVersion("ktor"); }

            /**
             * Returns the version associated to this alias: libres (1.2.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLibres() { return getVersion("libres"); }

            /**
             * Returns the version associated to this alias: multiplatformSettings (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMultiplatformSettings() { return getVersion("multiplatformSettings"); }

            /**
             * Returns the version associated to this alias: napier (2.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNapier() { return getVersion("napier"); }

            /**
             * Returns the version associated to this alias: precompose (1.5.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPrecompose() { return getVersion("precompose"); }

            /**
             * Returns the version associated to this alias: skiko (0.7.85)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSkiko() { return getVersion("skiko"); }

            /**
             * Returns the version associated to this alias: voyager (1.0.0-rc10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVoyager() { return getVersion("voyager"); }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() {
            return vaccForAndroidxVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.compose
         */
        public ComposeVersionAccessors getCompose() {
            return vaccForComposeVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.kotlinx
         */
        public KotlinxVersionAccessors getKotlinx() {
            return vaccForKotlinxVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.moko
         */
        public MokoVersionAccessors getMoko() {
            return vaccForMokoVersionAccessors;
        }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.activityCompose (1.8.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getActivityCompose() { return getVersion("androidx.activityCompose"); }

            /**
             * Returns the version associated to this alias: androidx.appcompat (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompat() { return getVersion("androidx.appcompat"); }

    }

    public static class ComposeVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public ComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: compose (1.5.10)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("compose"); }

            /**
             * Returns the version associated to this alias: compose.uitooling (1.5.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getUitooling() { return getVersion("compose.uitooling"); }

    }

    public static class KotlinxVersionAccessors extends VersionFactory  {

        public KotlinxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.coroutines (1.7.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoroutines() { return getVersion("kotlinx.coroutines"); }

            /**
             * Returns the version associated to this alias: kotlinx.datetime (0.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDatetime() { return getVersion("kotlinx.datetime"); }

            /**
             * Returns the version associated to this alias: kotlinx.serialization (1.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSerialization() { return getVersion("kotlinx.serialization"); }

    }

    public static class MokoVersionAccessors extends VersionFactory  {

        public MokoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: moko.mvvm (0.16.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMvvm() { return getVersion("moko.mvvm"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final AndroidPluginAccessors paccForAndroidPluginAccessors = new AndroidPluginAccessors(providers, config);
        private final KotlinxPluginAccessors paccForKotlinxPluginAccessors = new KotlinxPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for compose to the plugin id 'org.jetbrains.compose'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getCompose() { return createPlugin("compose"); }

            /**
             * Creates a plugin provider for libres to the plugin id 'io.github.skeptick.libres'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getLibres() { return createPlugin("libres"); }

            /**
             * Creates a plugin provider for multiplatform to the plugin id 'org.jetbrains.kotlin.multiplatform'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getMultiplatform() { return createPlugin("multiplatform"); }

        /**
         * Returns the group of plugins at plugins.android
         */
        public AndroidPluginAccessors getAndroid() {
            return paccForAndroidPluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.kotlinx
         */
        public KotlinxPluginAccessors getKotlinx() {
            return paccForKotlinxPluginAccessors;
        }

    }

    public static class AndroidPluginAccessors extends PluginFactory {

        public AndroidPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for android.application to the plugin id 'com.android.application'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getApplication() { return createPlugin("android.application"); }

    }

    public static class KotlinxPluginAccessors extends PluginFactory {

        public KotlinxPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for kotlinx.serialization to the plugin id 'org.jetbrains.kotlin.plugin.serialization'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getSerialization() { return createPlugin("kotlinx.serialization"); }

    }

}
