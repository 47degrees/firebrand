/*
 * Copyright (C) 2012 47 Degrees, LLC
 * http://47deg.com
 * hello@47deg.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.firebrandocm.dao.impl;

import me.prettyprint.cassandra.serializers.DoubleSerializer;
import org.firebrandocm.dao.TypeConverter;

import java.nio.ByteBuffer;

/**
 * Type converter to serialize to and from ByteBuffer's
 */
public class DoubleTypeConverter implements TypeConverter<Double> {
    /* Interface Implementations */


// --------------------- Interface TypeConverter ---------------------

	public ByteBuffer toValue(Double value) {
		return DoubleSerializer.get().toByteBuffer(value);
	}

	public Double fromValue(ByteBuffer value, Class<Double> targetType) {
		return DoubleSerializer.get().fromByteBuffer(value);
	}
}
