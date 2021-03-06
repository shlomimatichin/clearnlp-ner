/**
 * Copyright 2014, Emory University
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.emory.clir.clearnlp.component.mode.ner;

import java.io.ObjectInputStream;

import edu.emory.clir.clearnlp.classification.model.StringModel;
import edu.emory.clir.clearnlp.component.mode.ner.state.NERStateGreedy;
import edu.emory.clir.clearnlp.feature.common.CommonFeatureExtractor;

/**
 * @since 3.0.3
 * @author Jinho D. Choi ({@code jinho.choi@emory.edu})
 */
public class DefaultNERecognizer extends AbstractNERecognizer
{
	/** Creates a named entity recognizer for collect. */
	public DefaultNERecognizer(NERConfiguration configuration)
	{
		super(configuration);
	}
	
	/** Creates a named entity recognizer for train. */
	public DefaultNERecognizer(CommonFeatureExtractor<NERStateGreedy>[] extractors, Object lexicons)
	{
		super(extractors, lexicons);
	}
	
	/** Creates a named entity recognizer for bootstrap or evaluate. */
	public DefaultNERecognizer(CommonFeatureExtractor<NERStateGreedy>[] extractors, Object lexicons, StringModel[] models, boolean bootstrap)
	{
		super(extractors, lexicons, models, bootstrap);
	}
	
	/** Creates a named entity recognizer for decode. */
	public DefaultNERecognizer(ObjectInputStream in)
	{
		super(in);
	}
	
	/** Creates a named entity recognizer for decode. */
	public DefaultNERecognizer(byte[] models)
	{
		super(models);
	}
}