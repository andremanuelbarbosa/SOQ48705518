package com.andremanuelbarbosa.soq48705518;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.bundles.assets.AssetsBundleConfiguration;
import io.dropwizard.bundles.assets.AssetsConfiguration;

public class SOQ48705518Configuration extends Configuration implements AssetsBundleConfiguration {

    @JsonProperty
    private AssetsConfiguration assets;

    @Override
    public AssetsConfiguration getAssetsConfiguration() {

        return assets;
    }
}
