package com.ryantenney.passkit4j.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true, fluent=true)
@RequiredArgsConstructor
public class NumberField implements Field<Number> {

	@NonNull private String key;
	private String label;
	private String changeMessage;
	private TextAlignment textAlignment;

	@NonNull private Number value;
	private NumberStyle numberStyle;
	private String currencyCode;

	public NumberField(String key, String label, Number value) {
		this(key, value);
		this.label = label;
	}

}
