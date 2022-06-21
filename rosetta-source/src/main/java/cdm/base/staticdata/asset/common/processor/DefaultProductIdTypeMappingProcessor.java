package cdm.base.staticdata.asset.common.processor;

import cdm.base.staticdata.asset.common.ProductIdTypeEnum;
import cdm.base.staticdata.asset.common.ProductIdentifier;
import com.regnosys.rosetta.common.translation.MappingContext;
import com.regnosys.rosetta.common.translation.MappingProcessor;
import com.regnosys.rosetta.common.translation.Path;
import com.rosetta.model.lib.RosettaModelObjectBuilder;
import com.rosetta.model.lib.path.RosettaPath;

import java.util.List;
import java.util.Optional;

/**
 * FpML mapping processor.
 *
 * Set source to ProductIdTypeEnum.OTHER if empty
 */
@SuppressWarnings("unused")
public class DefaultProductIdTypeMappingProcessor extends MappingProcessor {

    public DefaultProductIdTypeMappingProcessor(RosettaPath modelPath, List<Path> synonymPaths, MappingContext mappingContext) {
        super(modelPath, synonymPaths, mappingContext);
    }

    @Override
    public <T> void mapBasic(Path synonymPath, Optional<T> instance, RosettaModelObjectBuilder parent) {
        if (!instance.isPresent()) {
            ((ProductIdentifier.ProductIdentifierBuilder) parent).setSource(ProductIdTypeEnum.OTHER);
        }
    }
}
