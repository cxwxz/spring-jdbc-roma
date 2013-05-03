/*
 * Copyright 2002-2013 the original author or authors.
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

package org.springframework.jdbc.roma.config.provider.properties;

import org.springframework.jdbc.roma.config.provider.ConfigProvider;
import org.springframework.jdbc.roma.domain.model.config.RowMapperBlobFieldConfig;
import org.springframework.jdbc.roma.domain.model.config.RowMapperClassConfig;
import org.springframework.jdbc.roma.domain.model.config.RowMapperClobFieldConfig;
import org.springframework.jdbc.roma.domain.model.config.RowMapperEnumFieldConfig;
import org.springframework.jdbc.roma.domain.model.config.RowMapperFieldConfig;
import org.springframework.jdbc.roma.domain.model.config.RowMapperObjectFieldConfig;
import org.springframework.jdbc.roma.domain.model.config.RowMapperTimestampFieldConfig;

/**
 * @author Serkan ÖZAL
 */
public class PropertiesBasedConfigProvider implements ConfigProvider {

	@Override
	public boolean isAvailable() {
		return false;
	}

	@Override
	public RowMapperFieldConfig getRowMapperFieldConfig(Class<?> clazz, String fieldName) {
		return null;
	}

	@Override
	public RowMapperObjectFieldConfig getRowMapperObjectFieldConfig(Class<?> clazz, String fieldName) {
		return null;
	}

	@Override
	public RowMapperEnumFieldConfig getRowMapperEnumFieldConfig(Class<?> clazz, String fieldName) {
		return null;
	}

	@Override
	public RowMapperClobFieldConfig getRowMapperClobFieldConfig(Class<?> clazz, String fieldName) {
		return null;
	}

	@Override
	public RowMapperBlobFieldConfig getRowMapperBlobFieldConfig(Class<?> clazz, String fieldName) {
		return null;
	}

	@Override
	public RowMapperTimestampFieldConfig getRowMapperTimestampFieldConfig(Class<?> clazz, String fieldName) {
		return null;
	}

	@Override
	public RowMapperClassConfig getRowMapperClassConfig(Class<?> clazz) {
		return null;
	}

}
