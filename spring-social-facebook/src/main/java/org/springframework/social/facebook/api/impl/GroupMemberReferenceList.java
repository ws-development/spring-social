/*
 * Copyright 2011 the original author or authors.
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
package org.springframework.social.facebook.api.impl;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.facebook.api.GroupMemberReference;

/**
 * Holder class to hold a typed list of GroupMemberReferences, pulled from the "data" field of the JSON object structure.
 * This helps Jackson know what type to deserialize list data into. 
 * @author Craig Walls
 */
class GroupMemberReferenceList {
	
	private final List<GroupMemberReference> list;

	@JsonCreator
	public GroupMemberReferenceList(@JsonProperty("data") List<GroupMemberReference> list) {
		this.list = list;
	}

	public List<GroupMemberReference> getList() {
		return list;
	}
}
