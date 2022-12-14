(ns teet.ui.icons
  (:require [teet.ui.material-ui :refer [Icon]]
            [teet.theme.theme-colors :as theme-colors])
  (:require-macros [teet.ui.icons :refer [define-font-icons]]))

;; This file defines all material ui icons from:
;; https://material.io/tools/icons/?style=baseline

;; Action icons
(define-font-icons {:prefix "action" :component Icon}
  "3d_rotation"
  "accessibility"
  "accessibility_new"
  "accessible"
  "login"
  "logout"
  "accessible_forward"
  "account_balance"
  "account_balance_wallet"
  "account_box"
  "account_circle"
  "add_shopping_cart"
  "alarm"
  "alarm_add"
  "alarm_off"
  "alarm_on"
  "all_inbox"
  "all_out"
  "android"
  "announcement"
  "arrow_right_alt"
  "aspect_ratio"
  "assessment"
  "assignment"
  "assignment_ind"
  "assignment_late"
  "assignment_return"
  "assignment_returned"
  "assignment_turned_in"
  "autorenew"
  "backup"
  "book"
  "bookmark"
  "bookmark_border"
  "bookmarks"
  "bug_report"
  "build"
  "cached"
  "calendar_today"
  "calendar_view_day"
  "camera_enhance"
  "card_giftcard"
  "card_membership"
  "card_travel"
  "change_history"
  "check_circle"
  "check_circle_outline"
  "chrome_reader_mode"
  "class"
  "code"
  "commute"
  "compare_arrows"
  "contact_support"
  "copyright"
  "credit_card"
  "dashboard"
  "date_range"
  "delete"
  "delete_forever"
  "delete_outline"
  "description"
  "dns"
  "done"
  "done_all"
  "done_outline"
  "donut_large"
  "donut_small"
  "drag_indicator"
  "eject"
  "euro_symbol"
  "event"
  "event_seat"
  "exit_to_app"
  "explore"
  "explore_off"
  "extension"
  "face"
  "favorite"
  "favorite_border"
  "feedback"
  "find_in_page"
  "find_replace"
  "fingerprint"
  "flight_land"
  "flight_takeoff"
  "flip_to_back"
  "flip_to_front"
  "g_translate"
  "gavel"
  "get_app"
  "gif"
  "grade"
  "group_work"
  "help"
  "help_outline"
  "highlight_off"
  "history"
  "home"
  "horizontal_split"
  "hourglass_empty"
  "hourglass_full"
  "http"
  "https"
  "important_devices"
  "info"
  "input"
  "invert_colors"
  "label"
  "label_important"
  "label_off"
  "language"
  "launch"
  "line_style"
  "line_weight"
  "list"
  "lock"
  "lock_open"
  "loyalty"
  "markunread_mailbox"
  "manage_accounts"
  "maximize"
  "minimize"
  "motorcycle"
  "note_add"
  "offline_bolt"
  "offline_pin"
  "opacity"
  "open_in_browser"
  "open_in_new"
  "open_with"
  "pageview"
  "pan_tool"
  "payment"
  "pending_actions"
  "perm_camera_mic"
  "perm_contact_calendar"
  "perm_data_setting"
  "perm_device_information"
  "perm_identity"
  "perm_media"
  "perm_phone_msg"
  "perm_scan_wifi"
  "pets"
  "picture_in_picture"
  "picture_in_picture_alt"
  "play_for_work"
  "polymer"
  "power_settings_new"
  "pregnant_woman"
  "print"
  "query_builder"
  "question_answer"
  "receipt"
  "record_voice_over"
  "redeem"
  "remove_shopping_cart"
  "reorder"
  "report_problem"
  "restore"
  "restore_from_trash"
  "restore_page"
  "room"
  "rounded_corner"
  "rowing"
  "schedule"
  "search"
  "settings"
  "settings_applications"
  "settings_backup_restore"
  "settings_bluetooth"
  "settings_brightness"
  "settings_cell"
  "settings_ethernet"
  "settings_input_antenna"
  "settings_input_component"
  "settings_input_composite"
  "settings_input_hdmi"
  "settings_input_svideo"
  "settings_overscan"
  "settings_phone"
  "settings_power"
  "settings_remote"
  "settings_voice"
  "shop"
  "shop_two"
  "shopping_basket"
  "shopping_cart"
  "speaker_notes"
  "speaker_notes_off"
  "spellcheck"
  "star_rate"
  "stars"
  "store"
  "subject"
  "supervised_user_circle"
  "supervisor_account"
  "swap_horiz"
  "swap_horizontal_circle"
  "swap_vert"
  "swap_vertical_circle"
  "tab"
  "tab_unselected"
  "text_rotate_up"
  "text_rotate_vertical"
  "text_rotation_down"
  "text_rotation_none"
  "theaters"
  "thumb_down"
  "thumb_up"
  "thumbs_up_down"
  "timeline"
  "toc"
  "today"
  "toll"
  "touch_app"
  "track_changes"
  "translate"
  "trending_down"
  "trending_flat"
  "trending_up"
  "turned_in"
  "turned_in_not"
  "update"
  "verified_user"
  "vertical_split"
  "view_agenda"
  "view_array"
  "view_carousel"
  "view_column"
  "view_day"
  "view_headline"
  "view_list"
  "view_module"
  "view_quilt"
  "view_stream"
  "view_week"
  "visibility"
  "visibility_off"
  "voice_over_off"
  "watch_later"
  "work"
  "work_off"
  "work_outline"
  "youtube_searched_for"
  "zoom_in"
  "zoom_out")

;; Alert icons
(define-font-icons {:prefix "alert" :component Icon}
  "add_alert"
  "error"
  "error_outline"
  "notification_important"
  "warning")

;; Av icons
(define-font-icons {:prefix "av" :component Icon}
  "4k"
  "add_to_queue"
  "airplay"
  "album"
  "art_track"
  "av_timer"
  "branding_watermark"
  "call_to_action"
  "closed_caption"
  "control_camera"
  "equalizer"
  "explicit"
  "fast_forward"
  "fast_rewind"
  "featured_play_list"
  "featured_video"
  "fiber_dvr"
  "fiber_manual_record"
  "fiber_new"
  "fiber_pin"
  "fiber_smart_record"
  "forward_10"
  "forward_30"
  "forward_5"
  "games"
  "hd"
  "hearing"
  "high_quality"
  "library_add"
  "library_books"
  "library_music"
  "loop"
  "mic"
  "mic_none"
  "mic_off"
  "missed_video_call"
  "movie"
  "music_video"
  "new_releases"
  "not_interested"
  "note"
  "pause"
  "pause_circle_filled"
  "pause_circle_outline"
  "play_arrow"
  "play_circle_filled"
  "play_circle_filled_white"
  "play_circle_outline"
  "playlist_add"
  "playlist_add_check"
  "playlist_play"
  "queue"
  "queue_music"
  "queue_play_next"
  "radio"
  "recent_actors"
  "remove_from_queue"
  "repeat"
  "repeat_one"
  "replay"
  "replay_10"
  "replay_30"
  "replay_5"
  "shuffle"
  "skip_next"
  "skip_previous"
  "slow_motion_video"
  "snooze"
  "sort_by_alpha"
  "stop"
  "subscriptions"
  "subtitles"
  "surround_sound"
  "video_call"
  "video_label"
  "video_library"
  "videocam"
  "videocam_off"
  "volume_down"
  "volume_mute"
  "volume_off"
  "volume_up"
  "web"
  "web_asset")

;; Communication icons
(define-font-icons {:prefix "communication" :component Icon}
  "alternate_email"
  "business"
  "call"
  "call_end"
  "call_made"
  "call_merge"
  "call_missed"
  "call_missed_outgoing"
  "call_received"
  "call_split"
  "cancel_presentation"
  "cell_wifi"
  "chat"
  "chat_bubble"
  "chat_bubble_outline"
  "clear_all"
  "comment"
  "contact_mail"
  "contact_phone"
  "contacts"
  "desktop_access_disabled"
  "dialer_sip"
  "dialpad"
  "domain_disabled"
  "duo"
  "email"
  "forum"
  "import_contacts"
  "import_export"
  "invert_colors_off"
  "list_alt"
  "live_help"
  "location_off"
  "location_on"
  "mail_outline"
  "message"
  "mobile_screen_share"
  "no_sim"
  "pause_presentation"
  "person_add_disabled"
  "phone"
  "phonelink_erase"
  "phonelink_lock"
  "phonelink_ring"
  "phonelink_setup"
  "portable_wifi_off"
  "present_to_all"
  "print_disabled"
  "ring_volume"
  "rss_feed"
  "screen_share"
  "sentiment_satisfied_alt"
  "speaker_phone"
  "stay_current_landscape"
  "stay_current_portrait"
  "stay_primary_landscape"
  "stay_primary_portrait"
  "stop_screen_share"
  "swap_calls"
  "textsms"
  "unsubscribe"
  "voicemail"
  "vpn_key")

;; Content icons
(define-font-icons {:prefix "content" :component Icon}
  "add"
  "add_box"
  "add_circle"
  "add_circle_outline"
  "archive"
  "backspace"
  "ballot"
  "block"
  "clear"
  "create"
  "delete_sweep"
  "drafts"
  "content_copy"
  "file_copy"
  "filter_list"
  "filter_alt"
  "flag"
  "font_download"
  "forward"
  "gesture"
  "how_to_reg"
  "how_to_vote"
  "inbox"
  "link"
  "link_off"
  "low_priority"
  "mail"
  "markunread"
  "move_to_inbox"
  "next_week"
  "outlined_flag"
  "redo"
  "remove"
  "remove_circle"
  "remove_circle_outline"
  "reply"
  "reply_all"
  "report"
  "report_off"
  "save"
  "save_alt"
  "select_all"
  "send"
  "sort"
  "shield"
  "text_format"
  "unarchive"
  "undo"
  "waves"
  "weekend"
  "where_to_vote")

;; Device icons
(define-font-icons {:prefix "device" :component Icon}
  "access_alarm"
  "access_alarms"
  "access_time"
  "add_alarm"
  "add_to_home_screen"
  "airplanemode_active"
  "airplanemode_inactive"
  "battery_20"
  "battery_30"
  "battery_50"
  "battery_60"
  "battery_80"
  "battery_90"
  "battery_alert"
  "battery_charging_20"
  "battery_charging_30"
  "battery_charging_50"
  "battery_charging_60"
  "battery_charging_80"
  "battery_charging_90"
  "battery_charging_full"
  "battery_full"
  "battery_std"
  "battery_unknown"
  "bluetooth"
  "bluetooth_connected"
  "bluetooth_disabled"
  "bluetooth_searching"
  "brightness_auto"
  "brightness_high"
  "brightness_low"
  "brightness_medium"
  "data_usage"
  "developer_mode"
  "devices"
  "dvr"
  "gps_fixed"
  "gps_not_fixed"
  "gps_off"
  "graphic_eq"
  "location_disabled"
  "location_searching"
  "mobile_friendly"
  "mobile_off"
  "network_cell"
  "network_wifi"
  "nfc"
  "screen_lock_landscape"
  "screen_lock_portrait"
  "screen_lock_rotation"
  "screen_rotation"
  "sd_storage"
  "settings_system_daydream"
  "signal_cellular_0_bar"
  "signal_cellular_1_bar"
  "signal_cellular_2_bar"
  "signal_cellular_3_bar"
  "signal_cellular_4_bar"
  "signal_cellular_alt"
  "signal_cellular_connected_no_internet_0_bar"
  "signal_cellular_connected_no_internet_1_bar"
  "signal_cellular_connected_no_internet_2_bar"
  "signal_cellular_connected_no_internet_3_bar"
  "signal_cellular_connected_no_internet_4_bar"
  "signal_cellular_no_sim"
  "signal_cellular_null"
  "signal_cellular_off"
  "signal_wifi_0_bar"
  "signal_wifi_1_bar"
  "signal_wifi_1_bar_lock"
  "signal_wifi_2_bar"
  "signal_wifi_2_bar_lock"
  "signal_wifi_3_bar"
  "signal_wifi_3_bar_lock"
  "signal_wifi_4_bar"
  "signal_wifi_4_bar_lock"
  "signal_wifi_off"
  "storage"
  "usb"
  "wallpaper"
  "widgets"
  "wifi_lock"
  "wifi_tethering")

;; Editor icons
(define-font-icons {:prefix "editor" :component Icon}
  "add_comment"
  "attach_file"
  "attach_money"
  "bar_chart"
  "border_all"
  "border_bottom"
  "border_clear"
  "border_color"
  "border_horizontal"
  "border_inner"
  "border_left"
  "border_outer"
  "border_right"
  "border_style"
  "border_top"
  "border_vertical"
  "bubble_chart"
  "drag_handle"
  "format_align_center"
  "format_align_justify"
  "format_align_left"
  "format_align_right"
  "format_bold"
  "format_clear"
  "format_color_fill"
  "format_color_reset"
  "format_color_text"
  "format_indent_decrease"
  "format_indent_increase"
  "format_italic"
  "format_line_spacing"
  "format_list_bulleted"
  "format_list_numbered"
  "format_list_numbered_rtl"
  "format_paint"
  "format_quote"
  "format_shapes"
  "format_size"
  "format_strikethrough"
  "format_textdirection_l_to_r"
  "format_textdirection_r_to_l"
  "format_underlined"
  "functions"
  "highlight"
  "insert_chart"
  "insert_comment"
  "insert_drive_file"
  "insert_emoticon"
  "insert_invitation"
  "insert_link"
  "insert_photo"
  "linear_scale"
  "merge_type"
  "mode_comment"
  "monetization_on"
  "money_off"
  "multiline_chart"
  "notes"
  "pie_chart"
  "publish"
  "scatter_plot"
  "score"
  "short_text"
  "show_chart"
  "space_bar"
  "strikethrough_s"
  "table_chart"
  "text_fields"
  "title"
  "vertical_align_bottom"
  "vertical_align_center"
  "vertical_align_top"
  "wrap_text"
  "schema")

;; File icons
(define-font-icons {:prefix "file" :component Icon}
  "attachment"
  "cloud"
  "cloud_circle"
  "cloud_done"
  "cloud_download"
  "cloud_off"
  "cloud_queue"
  "cloud_upload"
  "create_new_folder"
  "folder"
  "folder_open"
  "folder_shared"
  "file_download"
  "download")

;; Hardware icons
(define-font-icons {:prefix "hardware" :component Icon}
  "cast"
  "cast_connected"
  "cast_for_education"
  "computer"
  "desktop_mac"
  "desktop_windows"
  "developer_board"
  "device_hub"
  "device_unknown"
  "devices_other"
  "dock"
  "gamepad"
  "headset"
  "headset_mic"
  "keyboard"
  "keyboard_arrow_down"
  "keyboard_arrow_left"
  "keyboard_arrow_right"
  "keyboard_arrow_up"
  "keyboard_backspace"
  "keyboard_capslock"
  "keyboard_hide"
  "keyboard_return"
  "keyboard_tab"
  "keyboard_voice"
  "laptop"
  "laptop_chromebook"
  "laptop_mac"
  "laptop_windows"
  "memory"
  "mouse"
  "phone_android"
  "phone_iphone"
  "phonelink"
  "phonelink_off"
  "power_input"
  "router"
  "scanner"
  "security"
  "sim_card"
  "smartphone"
  "speaker"
  "speaker_group"
  "tablet"
  "tablet_android"
  "tablet_mac"
  "toys"
  "tv"
  "videogame_asset"
  "watch")

;; Image icons
(define-font-icons {:prefix "image" :component Icon}
  "add_a_photo"
  "add_photo_alternate"
  "add_to_photos"
  "adjust"
  "assistant"
  "assistant_photo"
  "audiotrack"
  "blur_circular"
  "blur_linear"
  "blur_off"
  "blur_on"
  "brightness_1"
  "brightness_2"
  "brightness_3"
  "brightness_4"
  "brightness_5"
  "brightness_6"
  "brightness_7"
  "broken_image"
  "brush"
  "burst_mode"
  "camera"
  "camera_alt"
  "camera_front"
  "camera_rear"
  "camera_roll"
  "center_focus_strong"
  "center_focus_weak"
  "circle"
  "collections"
  "collections_bookmark"
  "color_lens"
  "colorize"
  "compare"
  "control_point"
  "control_point_duplicate"
  "crop"
  "crop_16_9"
  "crop_3_2"
  "crop_5_4"
  "crop_7_5"
  "crop_din"
  "crop_free"
  "crop_landscape"
  "crop_original"
  "crop_portrait"
  "crop_rotate"
  "crop_square"
  "dehaze"
  "details"
  "edit"
  "exposure"
  "exposure_neg_1"
  "exposure_neg_2"
  "exposure_plus_1"
  "exposure_plus_2"
  "exposure_zero"
  "filter"
  "filter_1"
  "filter_2"
  "filter_3"
  "filter_4"
  "filter_5"
  "filter_6"
  "filter_7"
  "filter_8"
  "filter_9"
  "filter_9_plus"
  "filter_b_and_w"
  "filter_center_focus"
  "filter_drama"
  "filter_frames"
  "filter_hdr"
  "filter_none"
  "filter_tilt_shift"
  "filter_vintage"
  "flare"
  "flash_auto"
  "flash_off"
  "flash_on"
  "flip"
  "gradient"
  "grain"
  "grid_off"
  "grid_on"
  "hdr_off"
  "hdr_on"
  "hdr_strong"
  "hdr_weak"
  "healing"
  "image"
  "image_aspect_ratio"
  "image_search"
  "iso"
  "landscape"
  "leak_add"
  "leak_remove"
  "lens"
  "linked_camera"
  "looks"
  "looks_3"
  "looks_4"
  "looks_5"
  "looks_6"
  "looks_one"
  "looks_two"
  "loupe"
  "monochrome_photos"
  "movie_creation"
  "movie_filter"
  "music_note"
  "music_off"
  "nature"
  "nature_people"
  "navigate_before"
  "navigate_next"
  "palette"
  "panorama"
  "panorama_fish_eye"
  "panorama_horizontal"
  "panorama_vertical"
  "panorama_wide_angle"
  "photo"
  "photo_album"
  "photo_camera"
  "photo_filter"
  "photo_library"
  "photo_size_select_actual"
  "photo_size_select_large"
  "photo_size_select_small"
  "picture_as_pdf"
  "portrait"
  "remove_red_eye"
  "rotate_90_degrees_ccw"
  "rotate_left"
  "rotate_right"
  "shutter_speed"
  "slideshow"
  "straighten"
  "style"
  "switch_camera"
  "switch_video"
  "tag_faces"
  "texture"
  "timelapse"
  "timer"
  "timer_10"
  "timer_3"
  "timer_off"
  "tonality"
  "transform"
  "tune"
  "view_comfy"
  "view_compact"
  "vignette"
  "wb_auto"
  "wb_cloudy"
  "wb_incandescent"
  "wb_iridescent"
  "wb_sunny")

;; Maps icons
(define-font-icons {:prefix "maps" :component Icon}
  "360"
  "add_location"
  "atm"
  "beenhere"
  "category"
  "compass_calibration"
  "departure_board"
  "directions"
  "directions_bike"
  "directions_boat"
  "directions_bus"
  "directions_car"
  "directions_railway"
  "directions_run"
  "directions_subway"
  "directions_transit"
  "directions_walk"
  "edit_attributes"
  "edit_location"
  "ev_station"
  "fastfood"
  "flight"
  "hotel"
  "layers"
  "layers_clear"
  "local_activity"
  "local_airport"
  "local_atm"
  "local_bar"
  "local_cafe"
  "local_car_wash"
  "local_convenience_store"
  "local_dining"
  "local_drink"
  "local_florist"
  "local_gas_station"
  "local_grocery_store"
  "local_hospital"
  "local_hotel"
  "local_laundry_service"
  "local_library"
  "local_mall"
  "local_movies"
  "local_offer"
  "local_parking"
  "local_pharmacy"
  "local_phone"
  "local_pizza"
  "local_play"
  "local_post_office"
  "local_printshop"
  "local_see"
  "local_shipping"
  "local_taxi"
  "map"
  "money"
  "my_location"
  "navigation"
  "near_me"
  "not_listed_location"
  "person_pin"
  "person_pin_circle"
  "pin_drop"
  "place"
  "rate_review"
  "restaurant"
  "restaurant_menu"
  "satellite"
  "store_mall_directory"
  "streetview"
  "subway"
  "terrain"
  "traffic"
  "train"
  "tram"
  "transfer_within_a_station"
  "transit_enterexit"
  "trip_origin"
  "zoom_out_map")

;; Navigation icons
(define-font-icons {:prefix "navigation" :component Icon}
  "apps"
  "arrow_back"
  "arrow_back_ios"
  "arrow_downward"
  "arrow_drop_down"
  "arrow_drop_down_circle"
  "arrow_drop_up"
  "arrow_forward"
  "arrow_forward_ios"
  "arrow_left"
  "arrow_right"
  "arrow_upward"
  "cancel"
  "check"
  "chevron_left"
  "chevron_right"
  "close"
  "expand_less"
  "expand_more"
  "first_page"
  "fullscreen"
  "fullscreen_exit"
  "last_page"
  "menu"
  "more_horiz"
  "more_vert"
  "refresh"
  "subdirectory_arrow_left"
  "subdirectory_arrow_right"
  "unfold_less"
  "unfold_more")

;; Notification icons
(define-font-icons {:prefix "notification" :component Icon}
  "adb"
  "airline_seat_flat"
  "airline_seat_flat_angled"
  "airline_seat_individual_suite"
  "airline_seat_legroom_extra"
  "airline_seat_legroom_normal"
  "airline_seat_legroom_reduced"
  "airline_seat_recline_extra"
  "airline_seat_recline_normal"
  "bluetooth_audio"
  "confirmation_number"
  "disc_full"
  "drive_eta"
  "enhanced_encryption"
  "event_available"
  "event_busy"
  "event_note"
  "folder_special"
  "live_tv"
  "mms"
  "more"
  "network_check"
  "network_locked"
  "no_encryption"
  "ondemand_video"
  "personal_video"
  "phone_bluetooth_speaker"
  "phone_callback"
  "phone_forwarded"
  "phone_in_talk"
  "phone_locked"
  "phone_missed"
  "phone_paused"
  "power"
  "power_off"
  "priority_high"
  "sd_card"
  "sms"
  "sms_failed"
  "sync"
  "sync_disabled"
  "sync_problem"
  "system_update"
  "tap_and_play"
  "time_to_leave"
  "tv_off"
  "vibration"
  "voice_chat"
  "vpn_lock"
  "wc"
  "wifi"
  "wifi_off")

;; Places icons
(define-font-icons {:prefix "places" :component Icon}
  "ac_unit"
  "airport_shuttle"
  "all_inclusive"
  "beach_access"
  "business_center"
  "casino"
  "child_care"
  "child_friendly"
  "fitness_center"
  "free_breakfast"
  "golf_course"
  "hot_tub"
  "kitchen"
  "meeting_room"
  "no_meeting_room"
  "pool"
  "room_service"
  "rv_hookup"
  "smoke_free"
  "smoking_rooms"
  "spa")

;; Social icons
(define-font-icons {:prefix "social" :component Icon}
  "cake"
  "domain"
  "group"
  "group_add"
  "location_city"
  "mood"
  "mood_bad"
  "notifications"
  "notifications_active"
  "notifications_none"
  "notifications_off"
  "notifications_paused"
  "pages"
  "party_mode"
  "people"
  "people_outline"
  "person"
  "person_add"
  "person_outline"
  "plus_one"
  "poll"
  "public"
  "school"
  "sentiment_dissatisfied"
  "sentiment_satisfied"
  "sentiment_very_dissatisfied"
  "sentiment_very_satisfied"
  "share"
  "thumb_down_alt"
  "thumb_up_alt"
  "whatshot")

;; Toggle icons
(define-font-icons {:prefix "toggle" :component Icon}
  "check_box"
  "check_box_outline_blank"
  "indeterminate_check_box"
  "radio_button_checked"
  "radio_button_unchecked"
  "star"
  "star_border"
  "star_half"
  "toggle_off"
  "toggle_on")

(defn teet-details
  ([] (teet-details nil))
  ([opts]
   [:svg {:width 32 :height 33 :viewBox "0 0 32 33" :class (:class opts "")}
    [:path {:d "M25.4319 16.176C24.7839 16.176 24.2439 15.636 24.2439 14.988C24.2439 11.424 24.2439 7.82404 24.2439 4.26004C24.2439 3.10804 24.1719 3.03605 23.0559 3.03605C16.5759 3.03605 10.0959 3.03605 3.65189 3.03605C3.00389 3.03605 2.49989 3.54005 2.49989 4.18805C2.49989 12.396 2.49989 20.64 2.49989 28.848C2.49989 29.82 2.64389 29.964 3.61589 29.964C10.0599 29.964 16.5039 29.964 22.9479 29.964C23.5959 29.964 24.1359 30.468 24.1359 31.116C24.1359 31.764 23.5959 32.304 22.9479 32.304C16.6479 32.304 9.69989 32.304 3.47189 32.304C1.70789 32.304 0.519891 31.476 0.195891 30C0.123891 29.64 0.123891 29.28 0.123891 28.92C0.123891 20.748 0.159891 12.54 0.0878906 4.36804C0.0878906 3.10804 0.375891 2.10005 1.16789 1.41605C1.70789 0.912045 2.46389 0.696045 3.18389 0.696045H23.5959C24.3519 0.696045 25.0719 0.948045 25.6479 1.45204C26.4399 2.17204 26.6919 3.21604 26.6919 4.47605C26.6199 8.25605 26.6559 11.316 26.6559 14.952C26.6559 15.636 26.1159 16.176 25.4319 16.176Z"}]
    [:path {:d "M31.4794 31.9081C30.9394 32.4481 30.0754 32.4481 29.5354 31.9081C27.9514 30.3241 26.3674 28.7401 24.9274 27.2641C23.7394 27.4441 22.7674 27.7681 21.8314 27.7321C19.1314 27.6601 16.9714 25.4281 16.8634 22.6561C16.7554 19.9561 18.8434 17.6521 21.6874 17.3281C24.1714 17.0401 26.6554 18.9121 27.1954 21.5041C27.4114 22.5841 27.3034 23.6641 26.8354 24.6361C26.6554 24.9961 26.7274 25.1761 26.9794 25.4641C28.4914 26.9401 29.9674 28.4521 31.4794 29.9281C32.0194 30.5041 32.0194 31.3681 31.4794 31.9081ZM22.0474 25.6081C23.8114 25.6081 25.1434 24.3121 25.1794 22.5841C25.1794 20.8561 23.8474 19.4881 22.1554 19.4881C20.4274 19.4881 19.0594 20.8201 19.0234 22.5121C18.9874 24.2401 20.2834 25.6081 22.0474 25.6081Z"}]
    [:path {:d "M19.3842 14.484C19.3842 15.276 19.3842 16.032 19.3842 16.824C14.4882 16.824 9.59215 16.824 4.66016 16.824C4.66016 16.068 4.66016 15.312 4.66016 14.484C9.52016 14.484 14.4162 14.484 19.3842 14.484Z"}]
    [:path {:d "M4.62402 10.0561C4.62402 9.30007 4.62402 8.54407 4.62402 7.71606C9.52002 7.71606 14.416 7.71606 19.348 7.71606C19.348 8.47207 19.348 9.22807 19.348 10.0561C14.488 10.0561 9.59202 10.0561 4.62402 10.0561Z"}]]))

(defn teet-map
  ([] (teet-map nil))
  ([opts]
   [:svg {:width 40 :height 35 :viewBox "0 0 40 35" :class (:class opts "")}
    [:path {:d "M16.3233 23.3667L17.251 25.6861C16.3526 26.045 15.4566 26.3184 14.5826 26.5016L14.0723 24.0552C14.8047 23.9014 15.5616 23.6695 16.3233 23.3667ZM8.8843 26.3623C9.79984 26.626 10.7642 26.7677 11.7505 26.7823L11.7896 24.2823C11.023 24.2701 10.2784 24.1627 9.57523 23.96L8.8843 26.3623ZM28.5694 21.9995C29.2896 22.1412 29.9927 22.3877 30.6592 22.732L31.8067 20.5102C30.9278 20.0586 30.0025 19.7338 29.0528 19.5483L28.5694 21.9995ZM23.3545 19.9487L24.1016 22.3316C24.8658 22.0923 25.6202 21.9409 26.3477 21.8823L26.1475 19.3921C25.2344 19.4653 24.2945 19.6534 23.3545 19.9487ZM19.3409 21.8286C19.0601 22.0044 18.7842 22.1655 18.5132 22.3169L19.7291 24.4995C20.0342 24.3286 20.3467 24.148 20.6592 23.9527C21.0889 23.6866 21.5088 23.4497 21.9214 23.2398L20.7862 21.0132C20.3174 21.2524 19.834 21.5234 19.3409 21.8286ZM26.25 6.25C26.25 7.27055 26.0059 8.23734 25.5713 9.08695L20 20C20 20 14.3848 8.99656 14.3628 8.95016C13.9698 8.13477 13.75 7.2168 13.75 6.25C13.75 2.79781 16.5479 0 20 0C23.4521 0 26.25 2.79789 26.25 6.25ZM23.75 6.25C23.75 4.17969 22.0703 2.5 20 2.5C17.9297 2.5 16.25 4.17969 16.25 6.25C16.25 8.32031 17.9297 10 20 10C22.0703 10 23.75 8.32031 23.75 6.25ZM32.5 12.5H26.6357L25.3588 15H30.6982L33.3959 23.0957L32.5341 24.0479C33.4521 24.878 33.9282 25.6421 33.9306 25.6446L34.1943 25.4859L36.5308 32.5H3.4668L5.97172 24.9927C6.05961 25.0537 6.12797 25.1123 6.22563 25.1734L7.55375 23.0591C7.25586 22.8711 7.01172 22.6855 6.79688 22.5122L9.3018 15H14.6436C14.1138 13.9648 13.6963 13.147 13.3667 12.5H7.5L0 35H40L32.5 12.5Z"}]]))


(defn asset-manager []
  [:svg {:width "24" :height "24" :viewBox "0 0 24 24" :fill "none"}
   [:path {:d "M18 4H16V11.9L18 9.9V4Z" :fill "white"}]
   [:path {:d "M6 4H4V20H6V4Z" :fill "white"}]
   [:path {:d "M12 4H10V8H12V4Z" :fill "white"}]
   [:path {:d "M12 10H10V14H12V10Z" :fill "white"}]
   [:path {:d "M12 16H10V20H12V16Z" :fill "white"}]
   [:path {:d "M22.56 12.59L21.41 11.44C20.82 10.85 19.87 10.85 19.29 11.44L14 16.73V20H17.27L22.56 14.71C23.15 14.12 23.15 13.17 22.56 12.59ZM16.58 18.45H15.55V17.42L19 13.97L20.03 15L16.58 18.45Z" :fill "white"}]])

(defn key-person
  ([] (key-person theme-colors/chip-border-color))
  ([color]
   [:svg {:width "45" :height "24" :viewBox "0 0 45 24" :fill "none" :xmlns "http://www.w3.org/2000/svg"}
    [:path {:d "M39 19H33V15H30.32C29.18 17.42 26.72 19 24 19C20.14 19 17 15.86 17 12C17 8.14 20.14 5 24 5C26.72 5 29.17 6.58 30.32 9H41V15H39V19ZM35 17H37V13H39V11H28.94L28.71 10.33C28.01 8.34 26.11 7 24 7C21.24 7 19 9.24 19 12C19 14.76 21.24 17 24 17C26.11 17 28.01 15.66 28.71 13.67L28.94 13H35V17ZM24 15C22.35 15 21 13.65 21 12C21 10.35 22.35 9 24 9C25.65 9 27 10.35 27 12C27 13.65 25.65 15 24 15ZM24 11C23.45 11 23 11.45 23 12C23 12.55 23.45 13 24 13C24.55 13 25 12.55 25 12C25 11.45 24.55 11 24 11Z"
            :fill color}]
    [:path {:d "M12 2C6.48 2 2 6.48 2 12C2 17.52 6.48 22 12 22C17.52 22 22 17.52 22 12C22 6.48 17.52 2 12 2Z"
            :fill color}]]))

(defn green-check []
  [:svg {:width "45" :height "24" :viewBox "0 0 45 24" :fill "none" :xmlns "http://www.w3.org/2000/svg"}
   [:path {:d "M39 19H33V15H30.32C29.18 17.42 26.72 19 24 19C20.14 19 17 15.86 17 12C17 8.14 20.14 5 24 5C26.72 5 29.17 6.58 30.32 9H41V15H39V19ZM35 17H37V13H39V11H28.94L28.71 10.33C28.01 8.34 26.11 7 24 7C21.24 7 19 9.24 19 12C19 14.76 21.24 17 24 17C26.11 17 28.01 15.66 28.71 13.67L28.94 13H35V17ZM24 15C22.35 15 21 13.65 21 12C21 10.35 22.35 9 24 9C25.65 9 27 10.35 27 12C27 13.65 25.65 15 24 15ZM24 11C23.45 11 23 11.45 23 12C23 12.55 23.45 13 24 13C24.55 13 25 12.55 25 12C25 11.45 24.55 11 24 11Z"
           :fill "#308653"}]
   [:circle {:cx "12" :cy "12" :r "9"
             :fill "white"}]
   [:path {:d "M12 2C6.48 2 2 6.48 2 12C2 17.52 6.48 22 12 22C17.52 22 22 17.52 22 12C22 6.48 17.52 2 12 2ZM12 20C7.59 20 4 16.41 4 12C4 7.59 7.59 4 12 4C16.41 4 20 7.59 20 12C20 16.41 16.41 20 12 20ZM16.59 7.58L10 14.17L7.41 11.59L6 13L10 17L18 9L16.59 7.58Z"
           :fill "#308653"}]])

(defn red-rejected []
  [:svg {:width "45" :height "24" :viewBox "0 0 45 24" :fill "none" :xmlns "http://www.w3.org/2000/svg"}
   [:path {:d "M39 19H33V15H30.32C29.18 17.42 26.72 19 24 19C20.14 19 17 15.86 17 12C17 8.14 20.14 5 24 5C26.72 5 29.17 6.58 30.32 9H41V15H39V19ZM35 17H37V13H39V11H28.94L28.71 10.33C28.01 8.34 26.11 7 24 7C21.24 7 19 9.24 19 12C19 14.76 21.24 17 24 17C26.11 17 28.01 15.66 28.71 13.67L28.94 13H35V17ZM24 15C22.35 15 21 13.65 21 12C21 10.35 22.35 9 24 9C25.65 9 27 10.35 27 12C27 13.65 25.65 15 24 15ZM24 11C23.45 11 23 11.45 23 12C23 12.55 23.45 13 24 13C24.55 13 25 12.55 25 12C25 11.45 24.55 11 24 11Z"
           :fill "#D73E3E"}]
   [:circle {:cx "12" :cy "12" :r "9" :fill "white"}]
   [:path {:d "M12 2C6.48 2 2 6.48 2 12C2 17.52 6.48 22 12 22C17.52 22 22 17.52 22 12C22 6.48 17.52 2 12 2ZM12 20C7.59 20 4 16.41 4 12C4 7.59 7.59 4 12 4C16.41 4 20 7.59 20 12C20 16.41 16.41 20 12 20Z"
           :fill "#D73E3E"}]
   [:path {:d "M13 15H11V17H13V15Z" :fill "#D73E3E"}]
   [:path {:d "M13 7H11V13H13V7Z" :fill "#D73E3E"}]])