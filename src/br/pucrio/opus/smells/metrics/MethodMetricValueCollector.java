package br.pucrio.opus.smells.metrics;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import br.pucrio.opus.smells.metrics.calculators.CyclomaticComplexityCalculator;
import br.pucrio.opus.smells.metrics.calculators.MaxCallChainCalculator;
import br.pucrio.opus.smells.metrics.calculators.MethodLOCCalculator;
import br.pucrio.opus.smells.metrics.calculators.MethodLocalityRatioCalculator;
import br.pucrio.opus.smells.metrics.calculators.MethodParameterCountCalculator;

public class MethodMetricValueCollector extends MetricValueCollector<MethodDeclaration> {

	public MethodMetricValueCollector(TypeDeclaration declaringClass) {
		addCalculator(new MethodLOCCalculator());
		addCalculator(new CyclomaticComplexityCalculator());
		addCalculator(new MethodLocalityRatioCalculator(declaringClass));
		addCalculator(new MethodParameterCountCalculator());
		addCalculator(new MaxCallChainCalculator());
	}
	
	
}
