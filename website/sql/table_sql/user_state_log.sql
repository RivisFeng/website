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

 Date: 20/05/2018 21:59:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_state_log
-- ----------------------------
DROP TABLE IF EXISTS `user_state_log`;
CREATE TABLE `user_state_log`  (
  `log_id` bigint(20) NOT NULL COMMENT '用户日志ID',
  `log_type` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户日志类型 0：登录 1：退出（AES加密）',
  `log_create_time` datetime(0) NOT NULL COMMENT '用户日志创建时间',
  `log_ip` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户日志IP（AES加密）',
  `log_area` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户日志地区（AES加密）',
  `log_equipment` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户日志设备（AES加密）',
  `log_soft` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户日志软件（AES加密）',
  PRIMARY KEY (`log_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户日志表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
