(ns phzr.impl.accessors.pointer)

(def ^:private pointer-constants
  {:no-button "NO_BUTTON"
   :left-button "LEFT_BUTTON"
   :right-button "RIGHT_BUTTON"
   :middle-button "MIDDLE_BUTTON"
   :back-button "BACK_BUTTON"
   :forward-button "FORWARD_BUTTON"
   :eraser-button "ERASER_BUTTON"})

(def pointer-get-properties
  {:world-y "worldY"
   :y "y"
   :exists "exists"
   :client-y "clientY"
   :dirty "dirty"
   :client-x "clientX"
   :eraser-button "eraserButton"
   :is-mouse "isMouse"
   :button "button"
   :game "game"
   :page-x "pageX"
   :circle "circle"
   :middle-button "middleButton"
   :within-game "withinGame"
   :time-down "timeDown"
   :movement-y "movementY"
   :type "type"
   :duration "duration"
   :forward-button "forwardButton"
   :pointer-id "pointerId"
   :time-up "timeUp"
   :page-y "pageY"
   :total-touches "totalTouches"
   :world-x "worldX"
   :back-button "backButton"
   :active "active"
   :id "id"
   :movement-x "movementX"
   :screen-x "screenX"
   :identifier "identifier"
   :raw-movement-x "rawMovementX"
   :is-down "isDown"
   :target-object "targetObject"
   :position-down "positionDown"
   :position "position"
   :ms-since-last-click "msSinceLastClick"
   :x "x"
   :target "target"
   :is-up "isUp"
   :raw-movement-y "rawMovementY"
   :screen-y "screenY"
   :previous-tap-time "previousTapTime"
   :left-button "leftButton"
   :position-up "positionUp"
   :right-button "rightButton"})

(def pointer-set-properties
  {:y "y"
   :exists "exists"
   :client-y "clientY"
   :dirty "dirty"
   :client-x "clientX"
   :eraser-button "eraserButton"
   :is-mouse "isMouse"
   :button "button"
   :game "game"
   :page-x "pageX"
   :circle "circle"
   :middle-button "middleButton"
   :within-game "withinGame"
   :time-down "timeDown"
   :movement-y "movementY"
   :forward-button "forwardButton"
   :pointer-id "pointerId"
   :time-up "timeUp"
   :page-y "pageY"
   :total-touches "totalTouches"
   :back-button "backButton"
   :active "active"
   :id "id"
   :movement-x "movementX"
   :screen-x "screenX"
   :identifier "identifier"
   :raw-movement-x "rawMovementX"
   :is-down "isDown"
   :target-object "targetObject"
   :position-down "positionDown"
   :position "position"
   :ms-since-last-click "msSinceLastClick"
   :x "x"
   :target "target"
   :is-up "isUp"
   :raw-movement-y "rawMovementY"
   :screen-y "screenY"
   :previous-tap-time "previousTapTime"
   :left-button "leftButton"
   :position-up "positionUp"
   :right-button "rightButton"})