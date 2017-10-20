/*
 * Copyright 2017 Brooke Babcock <brooke@usinternet.com>.
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
package com.linkedin.urls.detection;

/**
 * Extended options for detection.
 * 
 */
public class UrlDetectorOptionsExtended {
  /**
   * Treat the underscore as a valid domain name character.
   */
  private boolean _allowUnderscoresInDomain;
  
  public static UrlDetectorOptionsExtended getDefault() {
    return new Builder().build();
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public boolean isUnderscoreAllowedInDomain() {
    return _allowUnderscoresInDomain;
  }
  
  public static class Builder {
    private final UrlDetectorOptionsExtended options;
    
    private Builder() {
      options = new UrlDetectorOptionsExtended();
    }
    
    public Builder setAllowUnderscoresInDomain() {
      options._allowUnderscoresInDomain = true;
      return this;
    }
    
    public UrlDetectorOptionsExtended build() {
      return options;
    }
  }
}
