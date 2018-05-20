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

 Date: 20/05/2018 21:57:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for curriculum_order
-- ----------------------------
DROP TABLE IF EXISTS `curriculum_order`;
CREATE TABLE `curriculum_order`  (
  `order_id` bigint(18) NOT NULL COMMENT '订单ID',
  `order_user_id` bigint(18) NOT NULL COMMENT '用户ID',
  `order_curriculum_id` bigint(18) NOT NULL COMMENT '课程ID',
  `order_create_time` datetime(0) NOT NULL COMMENT '订单创建时间',
  `order_create_user_state` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '创建这个订单时用户的状态（AES加密）',
  `order_cost` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '订单支付的金额（AES加密）',
  `order_state` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '订单状态 0：未完成 1：待支付 2：已支付 3：已完成（AES加密）',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '课程订单' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
