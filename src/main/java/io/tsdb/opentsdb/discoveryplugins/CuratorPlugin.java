package io.tsdb.opentsdb.discoveryplugins;
/**
 * Copyright 2015 The openfoo Authors
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import com.stumbleupon.async.Deferred;
import net.opentsdb.tools.StartupPlugin;
import net.opentsdb.stats.StatsCollector;
import net.opentsdb.utils.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuratorPlugin extends StartupPlugin {
  Logger log = LoggerFactory.getLogger(CuratorPlugin.class);

  public CuratorPlugin() {
    log.debug("constructor called");
  }

  @Override
  public void initialize(final Config config) throws IllegalArgumentException, Exception {
    log.debug("Finished with config");
    return;
  }

  @Override
  public Deferred<Object> shutdown() {
    log.debug("shutting down.");
    return null;
  }

  @Override
  public String version() {
    return "2.0.0";
  }

  @Override
  public String getType() { return "Curator Service Discovery"; }

  @Override
  public void collectStats(StatsCollector collector) {
    return;
  }
}
