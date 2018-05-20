/*
 Navicat MySQL Data Transfer

 Source Server         : sureface
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : officialwebsite

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 20/05/2018 21:58:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for system_switch_setting
-- ----------------------------
DROP TABLE IF EXISTS `system_switch_setting`;
CREATE TABLE `system_switch_setting`  (
  `switch_id` bigint(18) NOT NULL COMMENT '系统开关ID',
  `switch_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '系统开关名字（AES加密）',
  `switch_description` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '系统开关描述（AES加密）',
  `switch_value` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '系统开关（AES加密）',
  `switch_create_time` datetime(0) DEFAULT NULL COMMENT '系统开关创建时间',
  PRIMARY KEY (`switch_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '系统开关' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
