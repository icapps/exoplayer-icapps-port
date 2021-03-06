/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.google.android.exoplayer2.text.ttml;

import com.google.android.exoplayer2.text.Cue;

/**
 * Represents a TTML Region.
 */
/* package */ final class TtmlRegion {

  public final String id;
  public final TtmlLength x;
  public final TtmlLength y;
  @Cue.AnchorType
  public final int lineAnchor;
  public final TtmlLength width;
  public final TtmlLength height;
  public final @Cue.TextSizeType int textSizeType;
  public final float textSize;

  public TtmlRegion(String id) {
    this(
        id,
        /* position= */ null,
        /* line= */ null,
        /* lineType= */ Cue.TYPE_UNSET,
        /* lineAnchor= */ null,
        /* width= */ null,
        /* textSizeType= */ Cue.TYPE_UNSET,
        /* textSize= */ Cue.DIMEN_UNSET);
  }

  public TtmlRegion(String id, TtmlLength x, TtmlLength y,
                    @Cue.AnchorType int lineAnchor,
                    TtmlLength width, TtmlLength height,
                    int textSizeType,
                    float textSize) {
    this.id = id;
    this.x = x;
    this.y = y;
    this.lineAnchor = lineAnchor;
    this.width = width;
    this.height = height;
    this.textSizeType = textSizeType;
    this.textSize = textSize;
  }

}
